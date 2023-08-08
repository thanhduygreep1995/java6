package com.poly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.poly.dao.OrderDao;
import com.poly.dto.OrderDTO;
import com.poly.entity.Order;
import com.poly.service.OrderService;

public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderDao ordDao;
	
	@Override
	public Double getTotal() {
		return ordDao.getTotal();
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return ordDao.findAll();
	}

	@Override
	public Order save(OrderDTO orderDTO) {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setAccount(orderDTO.getAccount());
		order.setCreateDate(orderDTO.getCreateDate());
		order.setOrderDetail(orderDTO.getOrderDetail());
		order.setId(orderDTO.getId());
		order.setStatus(orderDTO.getStatus());
		order.setTotal(orderDTO.getTotal());
		return ordDao.save(order);
	}
	
}
