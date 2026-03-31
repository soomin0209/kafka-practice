package com.example.kafkapractice.domain.simple.listener;

import com.example.kafkapractice.domain.simple.model.kafka.SimpleEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SimpleEventListener {

    // 1. simple-events를 소비하는 Consumer-group을 총 3개를 생성
    // 2. 각각의 Consumer-group에 3개의 Consumer 생성 (총 9개의 Consumer)
    // 3. 각각의 Consumer들이 어떤 파티션에 연결 되었는지, 어디까지 읽었는지 확인 가능

    // simple-event-group-1
    @KafkaListener(
            topics = "simple-events",
            groupId = "simple-event-group-1",
            containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeV1A(SimpleEvent simpleEvent) {
        log.info("받은 이벤트: {}", simpleEvent);
    }

    @KafkaListener(
            topics = "simple-events",
            groupId = "simple-event-group-1",
            containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeV1B(SimpleEvent simpleEvent) {
        log.info("받은 이벤트: {}", simpleEvent);
    }

    @KafkaListener(
            topics = "simple-events",
            groupId = "simple-event-group-1",
            containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeV1C(SimpleEvent simpleEvent) {
        log.info("받은 이벤트: {}", simpleEvent);
    }

    // simple-event-group-2
    @KafkaListener(
            topics = "simple-events",
            groupId = "simple-event-group-2",
            containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeV2A(SimpleEvent simpleEvent) {
        log.info("받은 이벤트: {}", simpleEvent);
    }

    @KafkaListener(
            topics = "simple-events",
            groupId = "simple-event-group-2",
            containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeV2B(SimpleEvent simpleEvent) {
        log.info("받은 이벤트: {}", simpleEvent);
    }

    @KafkaListener(
            topics = "simple-events",
            groupId = "simple-event-group-2",
            containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeV2C(SimpleEvent simpleEvent) {
        log.info("받은 이벤트: {}", simpleEvent);
    }

    // simple-event-group-3
    @KafkaListener(
            topics = "simple-events",
            groupId = "simple-event-group-3",
            containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeV3A(SimpleEvent simpleEvent) {
        log.info("받은 이벤트: {}", simpleEvent);
    }

    @KafkaListener(
            topics = "simple-events",
            groupId = "simple-event-group-3",
            containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeV3B(SimpleEvent simpleEvent) {
        log.info("받은 이벤트: {}", simpleEvent);
    }

    @KafkaListener(
            topics = "simple-events",
            groupId = "simple-event-group-3",
            containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeV3C(SimpleEvent simpleEvent) {
        log.info("받은 이벤트: {}", simpleEvent);
    }
}
