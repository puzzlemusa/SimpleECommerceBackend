package com.puzzlemusa.customer.repositories;

import com.puzzlemusa.customer.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {
}
