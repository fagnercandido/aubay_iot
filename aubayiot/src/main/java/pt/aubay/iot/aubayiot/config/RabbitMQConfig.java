package pt.aubay.iot.aubayiot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue createQueue() {
        return new Queue("exampleQueue");
    }

    @Bean
    public Binding createBindingBetweenQueueAndMqttTopic() {
        return new Binding("exampleQueue", Binding.DestinationType.QUEUE, "amq.topic", "bindingKey", null);
    }
}
