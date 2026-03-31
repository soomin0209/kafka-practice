package com.example.kafkapractice.domain.simple.listener;

import com.example.kafkapractice.domain.simple.model.kafka.SimpleEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SimpleEventListener {

    @KafkaListener(
            topics = "simple-events",
            groupId = "simple-event-group",
            containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consume(SimpleEvent simpleEvent) {
        log.info("받은 이벤트: {}", simpleEvent);
    }
}
