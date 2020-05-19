package com.java.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.orderservice.controller.common.Payment;
import com.java.orderservice.controller.common.TransactionRequest;
import com.java.orderservice.controller.common.TransactionResponse;
import com.java.orderservice.entity.Order;
import com.java.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;
	
	
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) {
		
		return service.saveorder(request);
	}
}
