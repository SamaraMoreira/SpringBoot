package com.course.spring.repositories;

import com.course.spring.entities.Category;
import com.course.spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long> {

}
