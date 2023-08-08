package com.poly.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poly.dto.OrderDTO;
import com.poly.entity.Order;
import com.poly.service.OrderService;


@CrossOrigin("*")
@RestController
@RequestMapping("/rest/orders")
public class OrderRestController {
    @Autowired
    OrderService orderService;

    @GetMapping("/list")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
    @PostMapping("/create")
	public ResponseEntity<Order> createOrder(@RequestBody OrderDTO orderDTO) {
	    Order savedOrder = orderService.save(orderDTO);
	    return ResponseEntity.ok(savedOrder);
	}
}
