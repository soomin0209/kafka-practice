package com.example.kafkapractice.domain.simple.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SimpleMessageListener {

    // Consumer 등록
//    @KafkaListener(
//            topics = "simple-messages",
//            groupId = "simple-string-group3",  // ConsumerFactory의 groupId보다 우선순위 높음
//            containerFactory = "stringKafkaListenerContainerFactory"
//    )
//    public void consumeV1(String message) {
//        log.info("받은 메시지: {}", message);
//    }
//
//    @KafkaListener(
//            topics = "simple-messages",
//            groupId = "simple-string-group3",
//            containerFactory = "stringKafkaListenerContainerFactory"
//    )
//    public void consumeV2(String message) {
//        log.info("받은 메시지: {}", message);
//    }
//
//    @KafkaListener(
//            topics = "simple-messages",
//            groupId = "simple-string-group3",
//            containerFactory = "stringKafkaListenerContainerFactory"
//    )
//    public void consumeV3(String message) {
//        log.info("받은 메시지: {}", message);
//    }



    @KafkaListener(
            topics = "simple-messages",
            groupId = "simple-string-group-new",
            containerFactory = "stringKafkaListenerContainerFactory"
    )
    public void consume(String message) {
        log.info("받은 메시지: {}", message);
    }
}