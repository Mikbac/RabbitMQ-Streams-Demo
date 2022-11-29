package com.example.publisher.configuration;

import com.rabbitmq.stream.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.rabbit.stream.producer.RabbitStreamTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;

/**
 * Created by MikBac on 28.11.2022
 */

@Configuration
public class RabbitMQConfiguration {

    @Bean
    RabbitStreamTemplate streamTemplate(Environment env) {
        RabbitStreamTemplate template = new RabbitStreamTemplate(env, "test.stream.one");
        template.setProducerCustomizer((name, builder) -> builder.name("test"));
        template.setMessageConverter(messageConverter());
        return template;
    }

    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

}
