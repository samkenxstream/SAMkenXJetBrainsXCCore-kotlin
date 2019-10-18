/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.spring.tests.references;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("kotlin-ultimate/ultimate/testData/spring/core/references/navigation")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class SpringReferenceNavigationTestGenerated extends AbstractSpringReferenceNavigationTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInNavigation() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("kotlin-ultimate/ultimate/testData/spring/core/references/navigation"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("fileReferenceInClasspathResource.kt")
    public void testFileReferenceInClasspathResource() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/navigation/fileReferenceInClasspathResource.kt");
    }

    @TestMetadata("fileReferenceInClasspathXmlContext.kt")
    public void testFileReferenceInClasspathXmlContext() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/navigation/fileReferenceInClasspathXmlContext.kt");
    }

    @TestMetadata("packageReferenceInComponentScan.kt")
    public void testPackageReferenceInComponentScan() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/navigation/packageReferenceInComponentScan.kt");
    }

    @TestMetadata("qualifierReference.kt")
    public void testQualifierReference() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/navigation/qualifierReference.kt");
    }

    @TestMetadata("scopeReference.kt")
    public void testScopeReference() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/navigation/scopeReference.kt");
    }

    @TestMetadata("springBeanRefInFactoryContainsBean.kt")
    public void testSpringBeanRefInFactoryContainsBean() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/navigation/springBeanRefInFactoryContainsBean.kt");
    }

    @TestMetadata("springBeanRefInFactoryGetBean.kt")
    public void testSpringBeanRefInFactoryGetBean() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/navigation/springBeanRefInFactoryGetBean.kt");
    }

    @TestMetadata("springBeanRefInResource.kt")
    public void testSpringBeanRefInResource() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/navigation/springBeanRefInResource.kt");
    }

    @TestMetadata("springFactoryBeanRefInResource.kt")
    public void testSpringFactoryBeanRefInResource() throws Exception {
        runTest("kotlin-ultimate/ultimate/testData/spring/core/references/navigation/springFactoryBeanRefInResource.kt");
    }
}
