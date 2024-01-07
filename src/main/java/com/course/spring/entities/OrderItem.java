package com.course.spring.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Double subTotal(){
        double total;
        return total = quantity * price;
    }
}
