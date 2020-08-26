package com.puzzlemusa.order.services;

import com.puzzlemusa.order.models.Order;
import com.puzzlemusa.order.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllCustomer() {
        return orderRepository.findAll();
    }

    public Order getCustomerById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Order save(Order customer) {
        return orderRepository.save(customer);
    }
}
