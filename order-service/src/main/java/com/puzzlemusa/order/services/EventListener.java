package com.puzzlemusa.order.services;


import com.puzzlemusa.order.events.CustomerDeleted;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EventListener {
    private static final String TOPIC = "order";

    @KafkaListener(topics = TOPIC, groupId = "group_json", containerFactory = "kafkaListenerFactory")
    public void consume(CustomerDeleted customerDeleted){
        System.out.println("asdf");
    }
}
