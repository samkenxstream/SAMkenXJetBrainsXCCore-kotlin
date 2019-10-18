/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.spring.tests.quickfixes;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("kotlin-ultimate/ultimate/testData/quickFixes/spring")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SpringQuickFixTestGenerated extends AbstractSpringQuickFixTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInSpring() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("kotlin-ultimate/ultimate/testData/quickFixes/spring"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), true);
    }

    @TestMetadata("kotlin-ultimate/ultimate/testData/quickFixes/spring/addQualifierAnnotation")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class AddQualifierAnnotation extends AbstractSpringQuickFixTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInAddQualifierAnnotation() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("kotlin-ultimate/ultimate/testData/quickFixes/spring/addQualifierAnnotation"), Pattern.compile("^([\\w\\-_]+)\\.kt$"), true);
        }

        @TestMetadata("ambiguousBean.kt")
        public void testAmbiguousBean() throws Exception {
            runTest("kotlin-ultimate/ultimate/testData/quickFixes/spring/addQualifierAnnotation/ambiguousBean.kt");
        }
    }
}
