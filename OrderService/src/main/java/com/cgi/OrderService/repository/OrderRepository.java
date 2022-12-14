package com.cgi.OrderService.repository;

import org.springframework.stereotype.Repository;

import com.cgi.OrderService.models.Order;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


@Repository
public interface OrderRepository extends MongoRepository<Order, Integer> {
	
	List<Order> findByDeliveryStatus(String deliveryStatus);
	List<Order> findByUserId(Integer userId);

}
