package com.puzzlemusa.order.repositories;

import com.puzzlemusa.order.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
