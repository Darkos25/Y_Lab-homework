package com.example.Home_work_for_T1.Repository;

import com.example.Home_work_for_T1.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findOrderById(Long id);

    List<Order> findAll();
}
