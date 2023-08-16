package com.poly.service;

import java.util.List;

import com.poly.entity.OrderDetail;

public interface OrderDetailService {
	OrderDetail save(OrderDetail orderdetail);
	
	List<OrderDetail> saveAll(List<OrderDetail> orddetails);
}
