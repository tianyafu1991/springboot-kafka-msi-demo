package com.hwinfo.springbootkafkamsidemo.bussiness.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaConsumer {

    @KafkaListener(topics = "tianyafu001")
    public void listen (ConsumerRecord<?, ?> record) throws Exception {
        //topic = tianyafu001, offset = 1, value = 123456
        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }
}
