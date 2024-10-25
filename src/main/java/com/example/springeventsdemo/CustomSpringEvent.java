package com.example.springeventsdemo;

import org.springframework.context.ApplicationEvent;

// Событие с сообщением
public class CustomSpringEvent extends ApplicationEvent {
    private String message;

    public CustomSpringEvent(Object source, String message) {
        super(source); // Используем источник (source) для хранения информации о происхождении события
        this.message = message; // Сохраняем сообщение события
    }

    public String getMessage() {
        return message;
    }
}
