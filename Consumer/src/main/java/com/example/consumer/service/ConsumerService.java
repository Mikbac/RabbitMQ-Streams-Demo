package com.example.consumer.service;

import com.example.consumer.model.MessageModel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created by MikBac on 28.11.2022
 */

@Service
public class ConsumerService {

    @RabbitListener(queues = "test.stream.one")
    public void enrichLogMessage(MessageModel message) {
        System.out.println(message.toString());
    }

}
