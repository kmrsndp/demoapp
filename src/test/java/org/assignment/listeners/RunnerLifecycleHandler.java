package org.assignment.listeners;

import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.*;

public class RunnerLifecycleHandler implements EventListener {

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestRunStarted.class, this::onTestRunStarted);
        publisher.registerHandlerFor(TestRunFinished.class, this::onTestRunFinished);
        publisher.registerHandlerFor(TestCaseStarted.class, this::onTestCaseStarted);
        publisher.registerHandlerFor(TestCaseFinished.class, this::onTestCaseFinished);
    }

    private void onTestRunStarted(TestRunStarted event){
        System.out.println("Starting test run");
    }

    private void onTestRunFinished(TestRunFinished event){
        System.out.println("Finishing test run");
    }

    private void onTestCaseStarted(TestCaseStarted event){
        System.out.println("Starting test case");
    }

    private void onTestCaseFinished(TestCaseFinished event){
        System.out.println("Finishing test case");
    }
}
