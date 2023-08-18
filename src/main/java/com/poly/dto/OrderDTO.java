package com.poly.dto;

import java.util.Date;
import java.util.List;

import com.poly.entity.Account;
import com.poly.entity.OrderDetail;

import lombok.Data;

@Data
public class OrderDTO {

	private int id;
	
	private String address;
	private Double total;
	private Boolean status = false;
	private Date createDate = new Date();
	private Account account;
	private String username;
    private List<OrderDetail> orderDetail;
}
