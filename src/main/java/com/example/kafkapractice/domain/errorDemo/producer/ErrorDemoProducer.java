package com.example.kafkapractice.domain.errorDemo.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ErrorDemoProducer {

    private static final String TOPIC_ERROR_DEMO = "error-demo";

    private final KafkaTemplate<String, String> stringKafkaTemplate;

    public void send(String message) {
        stringKafkaTemplate.send(TOPIC_ERROR_DEMO, message);
    }
}
