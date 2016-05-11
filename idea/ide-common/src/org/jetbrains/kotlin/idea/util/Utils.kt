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

package org.jetbrains.kotlin.idea.util

import org.jetbrains.kotlin.descriptors.DeclarationDescriptor
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo
import org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager
import org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValue
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.checker.KotlinTypeChecker

fun KtFunctionLiteral.findLabelAndCall(): Pair<Name?, KtCallExpression?> {
    val literalParent = (this.parent as KtLambdaExpression).parent

    fun KtValueArgument.callExpression(): KtCallExpression? {
        val parent = parent
        return (if (parent is KtValueArgumentList) parent else this).parent as? KtCallExpression
    }

    when (literalParent) {
        is KtLabeledExpression -> {
            val callExpression = (literalParent.getParent() as? KtValueArgument)?.callExpression()
            return Pair(literalParent.getLabelNameAsName(), callExpression)
        }

        is KtValueArgument -> {
            val callExpression = literalParent.callExpression()
            val label = (callExpression?.calleeExpression as? KtSimpleNameExpression)?.getReferencedNameAsName()
            return Pair(label, callExpression)
        }

        else -> {
            return Pair(null, null)
        }
    }
}

fun SmartCastManager.getSmartCastVariantsWithLessSpecificExcluded(
        receiverToCast: ReceiverValue,
        bindingContext: BindingContext,
        containingDeclarationOrModule: DeclarationDescriptor,
        dataFlowInfo: DataFlowInfo
): List<KotlinType> {
    val variants = getSmartCastVariants(receiverToCast, bindingContext, containingDeclarationOrModule, dataFlowInfo).distinct()
    return variants.filter { type ->
        variants.none { another -> another !== type && KotlinTypeChecker.DEFAULT.isSubtypeOf(another, type) }
    }
}
