package com.api.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestListener implements ITestListener {

    private static final Logger logger = LogManager.getLogger(TestListener.class);

    public void onStart(ITestContext context) {
        logger.info("Test Suite Started!");
    }

    public void onTestStart(ITestResult result) {
        logger.info("Started!!"+ result.getMethod().getMethodName());
        logger.info("Description!!"+ result.getMethod().getDescription());
    }

    public void onTestSuccess(ITestResult result) {
        logger.info("Passed!!"+ result.getMethod().getMethodName());
        logger.info("Description!!"+ result.getMethod().getDescription());

    }

    public void onTestFailure(ITestResult result) {
        logger.error("Failed!!"+ result.getMethod().getMethodName());
    }

    public void onTestSkipped(ITestResult result) {
        logger.error("Skipped!!"+ result.getMethod().getMethodName());

    }


}
