package com.example.kafkapractice.domain.simple.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ManualAckConsumerListener {

    @KafkaListener(
            topics = "simple-messages",
            groupId = "manual-ack-group",
            containerFactory = "manualAckKafkaListenerContainerFactory"
    )
    public void consume(ConsumerRecord<String, String> record, Acknowledgment ack) {
        String message = record.value();
        log.info("[Manual ACK 모드] 받은 메시지 : {}", message);

        // 에러가 발생하면 Commit X
        if (message.equals("error")) {
            throw new RuntimeException("kafka 에러 발생");
        }

        // 수동 Commit
        ack.acknowledge();
        log.info("수동 커밋 완료!");
    }
}
