/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test.weighers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/idea-completion/testData/weighers/basic")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BasicCompletionWeigherTestGenerated extends AbstractBasicCompletionWeigherTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    @TestMetadata("AfterNullable.kt")
    public void testAfterNullable() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/AfterNullable.kt");
    }

    public void testAllFilesPresentInBasic() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/weighers/basic"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), TargetBackend.ANY, true);
    }

    @TestMetadata("CallableReference_NothingLast.kt")
    public void testCallableReference_NothingLast() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/CallableReference_NothingLast.kt");
    }

    @TestMetadata("Callables.kt")
    public void testCallables() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/Callables.kt");
    }

    @TestMetadata("DelegateToOtherObject.kt")
    public void testDelegateToOtherObject() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/DelegateToOtherObject.kt");
    }

    @TestMetadata("DeprecatedFun.kt")
    public void testDeprecatedFun() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/DeprecatedFun.kt");
    }

    @TestMetadata("DeprecatedJavaClass.kt")
    public void testDeprecatedJavaClass() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/DeprecatedJavaClass.kt");
    }

    @TestMetadata("DslCallWithExpectedType.kt")
    public void testDslCallWithExpectedType() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/DslCallWithExpectedType.kt");
    }

    @TestMetadata("DslCalls.kt")
    public void testDslCalls() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/DslCalls.kt");
    }

    @TestMetadata("DslCallsAnnotatedFunctionType.kt")
    public void testDslCallsAnnotatedFunctionType() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/DslCallsAnnotatedFunctionType.kt");
    }

    @TestMetadata("DslCallsWithMultipleReceivers.kt")
    public void testDslCallsWithMultipleReceivers() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/DslCallsWithMultipleReceivers.kt");
    }

    @TestMetadata("DslMemberCalls.kt")
    public void testDslMemberCalls() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/DslMemberCalls.kt");
    }

    @TestMetadata("ExactMatchForKeyword.kt")
    public void testExactMatchForKeyword() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/ExactMatchForKeyword.kt");
    }

    @TestMetadata("ImportedFirst.kt")
    public void testImportedFirst() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/ImportedFirst.kt");
    }

    @TestMetadata("ImportedFirstForJavaClass.kt")
    public void testImportedFirstForJavaClass() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/ImportedFirstForJavaClass.kt");
    }

    @TestMetadata("ImportedOrder.kt")
    public void testImportedOrder() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/ImportedOrder.kt");
    }

    @TestMetadata("KT-25588_1.kts")
    public void testKT_25588_1() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/KT-25588_1.kts");
    }

    @TestMetadata("KT-25588_2.kts")
    public void testKT_25588_2() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/KT-25588_2.kts");
    }

    @TestMetadata("KeywordsLast.kt")
    public void testKeywordsLast() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/KeywordsLast.kt");
    }

    @TestMetadata("LambdaSignature.kt")
    public void testLambdaSignature() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/LambdaSignature.kt");
    }

    @TestMetadata("LocalFileBeforeImported.kt")
    public void testLocalFileBeforeImported() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/LocalFileBeforeImported.kt");
    }

    @TestMetadata("LocalValuesAndParams.kt")
    public void testLocalValuesAndParams() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/LocalValuesAndParams.kt");
    }

    @TestMetadata("LocalsBeforeKeywords.kt")
    public void testLocalsBeforeKeywords() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/LocalsBeforeKeywords.kt");
    }

    @TestMetadata("LocalsPropertiesKeywords.kt")
    public void testLocalsPropertiesKeywords() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/LocalsPropertiesKeywords.kt");
    }

    @TestMetadata("NamedParameters.kt")
    public void testNamedParameters() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/NamedParameters.kt");
    }

    @TestMetadata("NamedParameters2.kt")
    public void testNamedParameters2() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/NamedParameters2.kt");
    }

    @TestMetadata("NamedParameters3.kt")
    public void testNamedParameters3() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/NamedParameters3.kt");
    }

    @TestMetadata("NoExpectedType.kt")
    public void testNoExpectedType() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/NoExpectedType.kt");
    }

    @TestMetadata("Packages.kt")
    public void testPackages() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/Packages.kt");
    }

    @TestMetadata("ParametersBeforeKeywords.kt")
    public void testParametersBeforeKeywords() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/ParametersBeforeKeywords.kt");
    }

    @TestMetadata("PreferFromJdk.kt")
    public void testPreferFromJdk() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/PreferFromJdk.kt");
    }

    @TestMetadata("PreferGetMethodToProperty.kt")
    public void testPreferGetMethodToProperty() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/PreferGetMethodToProperty.kt");
    }

    @TestMetadata("Prefix.kt")
    public void testPrefix() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/Prefix.kt");
    }

    @TestMetadata("PropertiesBeforeKeywords.kt")
    public void testPropertiesBeforeKeywords() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/PropertiesBeforeKeywords.kt");
    }

    @TestMetadata("StaticMembers.kt")
    public void testStaticMembers() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/StaticMembers.kt");
    }

    @TestMetadata("SuperMembers.kt")
    public void testSuperMembers() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/SuperMembers.kt");
    }

    @TestMetadata("TopLevelKeywordWithClassName.kt")
    public void testTopLevelKeywordWithClassName() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/TopLevelKeywordWithClassName.kt");
    }

    @TestMetadata("UnavailableDslReceiver.kt")
    public void testUnavailableDslReceiver() throws Exception {
        runTest("idea/idea-completion/testData/weighers/basic/UnavailableDslReceiver.kt");
    }

    @TestMetadata("idea/idea-completion/testData/weighers/basic/expectedInfo")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ExpectedInfo extends AbstractBasicCompletionWeigherTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        @TestMetadata("AfterAs.kt")
        public void testAfterAs() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/AfterAs.kt");
        }

        public void testAllFilesPresentInExpectedInfo() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/weighers/basic/expectedInfo"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("CompanionObjectMethod.kt")
        public void testCompanionObjectMethod() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/CompanionObjectMethod.kt");
        }

        @TestMetadata("EnumEntries.kt")
        public void testEnumEntries() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/EnumEntries.kt");
        }

        @TestMetadata("ExpectedType.kt")
        public void testExpectedType() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/ExpectedType.kt");
        }

        @TestMetadata("ExpectedType2.kt")
        public void testExpectedType2() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/ExpectedType2.kt");
        }

        @TestMetadata("LambdaValue.kt")
        public void testLambdaValue() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/LambdaValue.kt");
        }

        @TestMetadata("MultiArgsItem.kt")
        public void testMultiArgsItem() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/MultiArgsItem.kt");
        }

        @TestMetadata("NameSimilarity.kt")
        public void testNameSimilarity() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/NameSimilarity.kt");
        }

        @TestMetadata("NameSimilarityAndNoExpectedType.kt")
        public void testNameSimilarityAndNoExpectedType() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/NameSimilarityAndNoExpectedType.kt");
        }

        @TestMetadata("NameSimilarityAndNoExpectedType2.kt")
        public void testNameSimilarityAndNoExpectedType2() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/NameSimilarityAndNoExpectedType2.kt");
        }

        @TestMetadata("NoStupidComparison.kt")
        public void testNoStupidComparison() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/NoStupidComparison.kt");
        }

        @TestMetadata("Null.kt")
        public void testNull() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/Null.kt");
        }

        @TestMetadata("PreferMatchingThis.kt")
        public void testPreferMatchingThis() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/PreferMatchingThis.kt");
        }

        @TestMetadata("TrueFalse.kt")
        public void testTrueFalse() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/TrueFalse.kt");
        }

        @TestMetadata("WhenByEnum.kt")
        public void testWhenByEnum() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/expectedInfo/WhenByEnum.kt");
        }
    }

    @TestMetadata("idea/idea-completion/testData/weighers/basic/parameterNameAndType")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ParameterNameAndType extends AbstractBasicCompletionWeigherTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInParameterNameAndType() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/weighers/basic/parameterNameAndType"), Pattern.compile("^([^.]+)\\.(kt|kts)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("Deprecated.kt")
        public void testDeprecated() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/parameterNameAndType/Deprecated.kt");
        }

        @TestMetadata("FromCurrentFilePriority.kt")
        public void testFromCurrentFilePriority() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/parameterNameAndType/FromCurrentFilePriority.kt");
        }

        @TestMetadata("ImportedFirst.kt")
        public void testImportedFirst() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/parameterNameAndType/ImportedFirst.kt");
        }

        @TestMetadata("MoreWordsMatchFirst.kt")
        public void testMoreWordsMatchFirst() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/parameterNameAndType/MoreWordsMatchFirst.kt");
        }

        @TestMetadata("ShorterFirst.kt")
        public void testShorterFirst() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/parameterNameAndType/ShorterFirst.kt");
        }

        @TestMetadata("StartMatchFirst.kt")
        public void testStartMatchFirst() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/parameterNameAndType/StartMatchFirst.kt");
        }

        @TestMetadata("UserPrefix.kt")
        public void testUserPrefix() throws Exception {
            runTest("idea/idea-completion/testData/weighers/basic/parameterNameAndType/UserPrefix.kt");
        }
    }
}
