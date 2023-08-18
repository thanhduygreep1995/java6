package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.entity.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {
	@Query(value = "SELECT SUM(oi.total) FROM Orders oi ", nativeQuery = true)
    Double getTotal();
	
	@Query("SELECT o FROM Order o WHERE o.account.username=?1")
	List<Order> findByUsername(String username);
}
