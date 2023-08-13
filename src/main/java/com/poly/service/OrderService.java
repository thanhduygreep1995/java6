package com.poly.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.poly.dto.OrderDTO;
import com.poly.entity.Order;

public interface OrderService {
	Double getTotal();
	List<Order> getAllOrders();
	Order save(OrderDTO orderDTO);
	Order create(JsonNode orderData);
}
