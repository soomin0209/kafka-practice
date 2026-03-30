package com.example.kafkapractice.domain.simple.controller;

import com.example.kafkapractice.domain.simple.model.request.SimpleSendRequest;
import com.example.kafkapractice.domain.simple.producer.SimpleMessageProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/simple")
public class SimpleController {

    private final SimpleMessageProducer simpleMessageProducer;

    @PostMapping
    public ResponseEntity<Void> sendSimpleMessage(@RequestBody SimpleSendRequest request) {
        simpleMessageProducer.send(request.message());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
