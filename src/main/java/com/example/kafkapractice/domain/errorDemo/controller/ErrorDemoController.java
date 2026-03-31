package com.example.kafkapractice.domain.errorDemo.controller;

import com.example.kafkapractice.domain.errorDemo.producer.ErrorDemoProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/error-demo")
public class ErrorDemoController {

    private final ErrorDemoProducer errorDemoProducer;

    @PostMapping
    public ResponseEntity<Void> sendErrorDemoMessage() {
        errorDemoProducer.send("error");
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
