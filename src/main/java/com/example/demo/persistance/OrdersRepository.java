package com.example.demo.persistance;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.entity.Orders;

public interface OrdersRepository extends JpaRepositoryImplementation<Orders, Integer> {

}
