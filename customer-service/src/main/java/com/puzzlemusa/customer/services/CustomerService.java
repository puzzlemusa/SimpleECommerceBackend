package com.puzzlemusa.customer.services;

import com.puzzlemusa.customer.models.Customer;
import com.puzzlemusa.customer.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Long id){
        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

}
