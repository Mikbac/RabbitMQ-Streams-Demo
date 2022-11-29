package com.example.publisher.controller;

import com.example.publisher.model.MessageModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.rabbit.stream.producer.RabbitStreamTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MikBac on 28.11.2022
 */

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
@Slf4j
public class MessageController {

    private final RabbitStreamTemplate rabbitStreamTemplate;

    @PostMapping("message")
    public ResponseEntity<Void> receivedMessage(@RequestBody MessageModel message) {
        rabbitStreamTemplate.convertAndSend(message);
        log.info("Published: {} {}", message.getTitle(), message.getUsername());
        return ResponseEntity.ok().build();
    }

}
