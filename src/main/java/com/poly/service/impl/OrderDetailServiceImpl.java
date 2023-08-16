package com.poly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.dao.OrderDetailDao;
import com.poly.entity.OrderDetail;
import com.poly.service.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService{
	@Autowired
	OrderDetailDao orddeDao;
	
	@Override
	public OrderDetail save(OrderDetail orderdetail) {
		return orddeDao.save(orderdetail);
	}

	@Override
	public List<OrderDetail> saveAll(List<OrderDetail> orddetails) {
		return orddeDao.saveAll(orddetails);
	}

	

}
