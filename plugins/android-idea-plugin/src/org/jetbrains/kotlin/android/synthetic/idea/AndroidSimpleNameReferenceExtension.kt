/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.android.synthetic.idea

import com.intellij.psi.PsiElement
import org.jetbrains.android.dom.wrappers.ValueResourceElementWrapper
import org.jetbrains.kotlin.android.synthetic.isAndroidSyntheticElement
import org.jetbrains.kotlin.idea.references.KtSimpleNameReference
import org.jetbrains.kotlin.plugin.references.SimpleNameReferenceExtension
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.KtPsiFactory

public class AndroidSimpleNameReferenceExtension : SimpleNameReferenceExtension {
    override fun isReferenceTo(reference: KtSimpleNameReference, element: PsiElement): Boolean? {
        val resolvedElement = reference.resolve() as? KtProperty ?: return null

        if (isAndroidSyntheticElement(resolvedElement)) {
            if (element is ValueResourceElementWrapper) {
                val resource = element.value
                return resolvedElement.name == resource.substring(resource.indexOf('/') + 1)
            }
        }
        return null
    }

    override fun handleElementRename(reference: KtSimpleNameReference, psiFactory: KtPsiFactory, newElementName: String): PsiElement? {
        return if (newElementName.startsWith("@+id/"))
            psiFactory.createNameIdentifier(newElementName.substring(newElementName.indexOf('/') + 1))
        else
            null
    }
}