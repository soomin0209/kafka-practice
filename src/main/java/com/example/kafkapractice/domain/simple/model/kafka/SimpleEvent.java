package com.example.kafkapractice.domain.simple.model.kafka;

import java.time.LocalDateTime;

public record SimpleEvent(
        String message,
        String worker,
        LocalDateTime createdAt
) {
    public static SimpleEvent of(String message) {
        return new SimpleEvent(message, "me", LocalDateTime.now());
    }
}
