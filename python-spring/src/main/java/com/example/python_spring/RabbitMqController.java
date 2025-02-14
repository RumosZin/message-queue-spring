package com.example.python_spring;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class RabbitMqController {
    private final RabbitMqService rabbitMqService;

    @PostMapping("/send/message")
    public ResponseEntity<String> sendMessage(
            @RequestBody MessageDto messageDto
    ) {
        this.rabbitMqService.sendMessage(messageDto);
        return ResponseEntity.ok("Message sent to RabbitMQ");
    }
}