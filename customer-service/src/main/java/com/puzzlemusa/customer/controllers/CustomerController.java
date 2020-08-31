package com.puzzlemusa.customer.controllers;

import com.puzzlemusa.customer.models.Customer;
import com.puzzlemusa.customer.services.CustomerService;
import com.puzzlemusa.customer.services.EventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;
    private EventPublisher eventPublisher;

    public CustomerController(CustomerService customerService, EventPublisher eventPublisher){
        this.customerService = customerService;
        this.eventPublisher = eventPublisher;
    }

    @GetMapping()
    public ResponseEntity<List<Customer>> getAll(){
        List<Customer> allCustomer = customerService.getAllCustomer();
        return new ResponseEntity<>(allCustomer, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getById(@PathVariable Long id){
        Customer customer = customerService.getCustomerById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        Customer savedCustomer = customerService.save(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomerById(id);
        eventPublisher.sendCustomerDeletedEvent(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
