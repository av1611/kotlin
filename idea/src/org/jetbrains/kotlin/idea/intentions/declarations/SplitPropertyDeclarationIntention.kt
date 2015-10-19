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

package org.jetbrains.kotlin.idea.intentions.declarations

import com.intellij.codeInsight.intention.LowPriorityAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.util.TextRange
import org.jetbrains.kotlin.idea.intentions.JetSelfTargetingRangeIntention
import org.jetbrains.kotlin.idea.intentions.splitPropertyDeclaration
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.psiUtil.startOffset

public class SplitPropertyDeclarationIntention : JetSelfTargetingRangeIntention<KtProperty>(javaClass(), "Split property declaration"), LowPriorityAction {
    override fun applicabilityRange(element: KtProperty): TextRange? {
        if (!element.isLocal()) return null
        val initializer = element.getInitializer() ?: return null
        return TextRange(element.startOffset, initializer.startOffset)
    }

    override fun applyTo(element: KtProperty, editor: Editor) {
        splitPropertyDeclaration(element)
    }
}
