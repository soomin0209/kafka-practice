package com.example.kafkapractice.domain.simple.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleMessageProducer {

    // 메시지를 보낼 Topic 지정
    private static final String TOPIC_SIMPLE = "simple-messages";

    // kafka Config에서 설정한 KafkaTemplate<String, String> 설정 불러오기
    private final KafkaTemplate<String, String> stringStringKafkaTemplate;

    public void send(String message) {
        stringStringKafkaTemplate.send(TOPIC_SIMPLE, message);
    }
}
