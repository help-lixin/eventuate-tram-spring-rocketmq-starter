package help.lixin.eventuate;

import help.lixin.eventuate.tram.consumer.rocketmq.EventuateTramRocketMQMessageConsumerConfiguration;
import io.eventuate.tram.spring.commands.consumer.TramCommandConsumerConfiguration;
import io.eventuate.tram.spring.commands.producer.TramCommandProducerConfiguration;
import io.eventuate.tram.spring.consumer.common.TramConsumerCommonConfiguration;
import io.eventuate.tram.spring.consumer.jdbc.TramConsumerJdbcAutoConfiguration;
import io.eventuate.tram.spring.events.publisher.TramEventsPublisherConfiguration;
import io.eventuate.tram.spring.events.subscriber.TramEventSubscriberConfiguration;
import io.eventuate.tram.spring.messaging.producer.jdbc.TramMessageProducerJdbcConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ //
        TramEventsPublisherConfiguration.class,
        //
        TramMessageProducerJdbcConfiguration.class,
        //
        TramCommandProducerConfiguration.class,
        //
        TramConsumerCommonConfiguration.class,
        //
        TramConsumerJdbcAutoConfiguration.class,
        //
        TramCommandConsumerConfiguration.class,
        //
        TramEventSubscriberConfiguration.class,
        //
        EventuateTramRocketMQMessageConsumerConfiguration.class})
public class EventuateRocketMQAutoConfiguration {

}
