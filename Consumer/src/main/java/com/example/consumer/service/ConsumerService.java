package com.example.consumer.service;

import com.example.consumer.model.MessageModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import static com.example.consumer.configuration.ConfigConstants.MESSAGE_STREAM;

/**
 * Created by MikBac on 28.11.2022
 */

@Service
@Slf4j
public class ConsumerService {

    @RabbitListener(queues = MESSAGE_STREAM)
    public void enrichLogMessage(MessageModel message) {
        log.info("Consumed: {}", message.toString());
    }

}
