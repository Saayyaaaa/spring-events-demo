package com.example.springeventsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private CustomSpringEventPublisher eventPublisher;

    @Override
    public void run(String... args) throws Exception {
        eventPublisher.publishCustomEvent("Hello, Spring Event!");
    }
}
