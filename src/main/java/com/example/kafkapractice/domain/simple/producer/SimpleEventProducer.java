package com.example.kafkapractice.domain.simple.producer;

import com.example.kafkapractice.domain.simple.model.kafka.SimpleEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleEventProducer {

    private static final String TOPIC_EVENT = "simple-events";

    private final KafkaTemplate<String, SimpleEvent> eventKafkaTemplate;

    public void send(SimpleEvent simpleEvent) {
        eventKafkaTemplate.send(TOPIC_EVENT, simpleEvent);
    }
}
