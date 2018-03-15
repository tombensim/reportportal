package com.epam.rp.tests;

import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Andrei Varabyeu
 */
public class Runner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG(false);
        List<Class<? extends ITestNGListener>> classes = new ArrayList<>();
        classes.add(ReportPortalTestNGListener.class);

        testNG.setListenerClasses(classes);

        testNG.setTestSuites(Arrays.asList("suites/logging_tests.xml"));

        TestListenerAdapter results = new TestListenerAdapter();
        testNG.addListener(results);
        boolean hasFailures;
        try {
            testNG.run();
            hasFailures = results.getFailedTests().size() > 0 || results.getSkippedTests().size() > 0;
        } catch (Throwable e) {
            /* something goes wrong... */
            hasFailures = true;
            e.printStackTrace();
        }
        System.exit(hasFailures ? 1 : 0);

    }

}
