#

https://docs.spring.io/spring-amqp/docs/current/reference/html/stream.html
https://rabbitmq.github.io/rabbitmq-stream-java-client/stable/htmlsingle/

## RabbitMQ

```shell
docker run -d -p 5672:5672 -p 5552:5552 -p 15672:15672 --name demo-rabbit -e RABBITMQ_DEFAULT_USER=guest -e RABBITMQ_DEFAULT_PASS=guest -e RABBITMQ_SERVER_ADDITIONAL_ERL_ARGS="-rabbitmq_stream advertised_host localhost" rabbitmq:3.11.3-management
```
or
```shell
docker run -d \
  -p 5672:5672 \
  -p 5552:5552 \
  -p 15672:15672 \
  --name demo-rabbit \
  -e RABBITMQ_DEFAULT_USER=guest \
  -e RABBITMQ_DEFAULT_PASS=guest \
  -e RABBITMQ_SERVER_ADDITIONAL_ERL_ARGS='-rabbitmq_stream advertised_host localhost' rabbitmq:3.11.3-management
```

```shell
docker exec demo-rabbit rabbitmq-plugins enable rabbitmq_stream
```

RabbitMQ GUI `http://localhost:15672/`.

##

```http request
POST http://localhost:8081/message
}
```