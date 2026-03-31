package com.example.kafkapractice.domain.errorDemo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ErrorDemoListener {

    @KafkaListener(
            topics = "error-demo",
            groupId = "error-demo-group",
            containerFactory = "errorDemoKafkaListenerContainerFactory"
    )
    public void consume(String message) {
        log.info("[error-demo] 받은 메시지: {}", message);

        if (message.contains("error")) {
            log.info("에러 발생! 예외 발생!");
            throw new RuntimeException("테스트용 예외");
        }

        log.info("정상 처리 완료 : {}", message);
    }
}
