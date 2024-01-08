package com.course.spring.repositories;

import com.course.spring.entities.Category;
import com.course.spring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
