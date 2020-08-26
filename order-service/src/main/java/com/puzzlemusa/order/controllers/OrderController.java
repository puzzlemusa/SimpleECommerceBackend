package com.puzzlemusa.order.controllers;

import com.puzzlemusa.order.models.Order;
import com.puzzlemusa.order.services.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping()
    public ResponseEntity<List<Order>> getAll(){
        List<Order> allOrder = orderService.getAllCustomer();
        return new ResponseEntity<>(allOrder, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getById(@PathVariable Long id){
        Order order = orderService.getCustomerById(id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Order> saveCustomer(@RequestBody Order customer){
        Order savedOrder = orderService.save(customer);
        return new ResponseEntity<>(savedOrder, HttpStatus.OK);
    }
}
