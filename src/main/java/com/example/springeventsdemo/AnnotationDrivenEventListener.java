package com.example.springeventsdemo;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenEventListener {

    @EventListener
    public void handleContextStart (CustomSpringEvent cse){
        System.out.println("Handling context started event.");
    }
}
