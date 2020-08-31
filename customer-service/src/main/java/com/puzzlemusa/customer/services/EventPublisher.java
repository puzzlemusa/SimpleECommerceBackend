package com.puzzlemusa.customer.services;

import com.puzzlemusa.customer.events.CustomerDeleted;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventPublisher {

    @Autowired
    private KafkaTemplate<String, CustomerDeleted> kafkaTemplate;
    private static final String TOPIC = "order";

    public void sendCustomerDeletedEvent(Long customerId){
        kafkaTemplate.send(TOPIC, new CustomerDeleted(customerId));
    }
}
