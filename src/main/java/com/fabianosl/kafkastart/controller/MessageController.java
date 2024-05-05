package com.fabianosl.kafkastart.controller;

import com.fabianosl.kafkastart.kafka.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {

    private final Producer producer;

    @PostMapping
    public void createMessage(@RequestBody String message) {
        producer.send(message);
        ResponseEntity.ok();
    }
}
