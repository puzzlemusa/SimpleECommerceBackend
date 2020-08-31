package com.puzzlemusa.customer.services;

import com.puzzlemusa.customer.models.Customer;
import com.puzzlemusa.customer.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Logger;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    private final static Logger LOGGER = Logger.getLogger(CustomerService.class.getName());

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Long id){
        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    public void deleteCustomerById(Long id) {
        Customer customer = getCustomerById(id);
        if(customer != null){
            customerRepository.deleteById(id);
            LOGGER.info("Customer deleted with id: " + id);
        }
        else
            LOGGER.info("No used found with id: " + id);

    }
}
