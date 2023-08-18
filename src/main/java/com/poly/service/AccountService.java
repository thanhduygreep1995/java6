package com.poly.service;

import java.util.List;
import java.util.Optional;

import com.poly.entity.Account;

public interface AccountService {
	Optional<Account> findById(String username);
	
	Account finById(String username);
	
	Account findByUsername(String username);
	
	List<Account> findAll();
	
	Account update(Account account);
	
	void delete(String username);
}
