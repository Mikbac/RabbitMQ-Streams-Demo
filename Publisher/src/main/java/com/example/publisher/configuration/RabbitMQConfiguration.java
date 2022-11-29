package com.example.publisher.configuration;

import com.rabbitmq.stream.Environment;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.rabbit.stream.producer.RabbitStreamTemplate;

import static com.example.publisher.configuration.ConfigConstants.MESSAGE_STREAM;

/**
 * Created by MikBac on 28.11.2022
 */

@Configuration
public class RabbitMQConfiguration {

    @Bean
    RabbitStreamTemplate streamTemplate(final Environment environment) {
        environment.streamCreator().stream(MESSAGE_STREAM).create();
        RabbitStreamTemplate template = new RabbitStreamTemplate(environment, MESSAGE_STREAM);
        template.setMessageConverter(messageConverter());
        return template;
    }

    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

}
