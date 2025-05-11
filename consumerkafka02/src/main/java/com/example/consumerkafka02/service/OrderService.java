package com.example.consumerkafka02.service;

import com.example.consumerkafka02.record.OrderRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @KafkaListener(topicPartitions = @TopicPartition(topic = "napoleao-order-processed", partitions = { "0" }), containerFactory = "orderKafkaListenerContainerFactory")
    public void orderListener(OrderRecord order) {
        System.out.println("Received Message Consumer 02: " + order.name());
    }

}
