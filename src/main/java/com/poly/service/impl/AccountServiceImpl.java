package com.poly.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.dao.AccountDao;
import com.poly.entity.Account;
import com.poly.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDao accdao;

	@Override
	public Optional<Account> findById(String username) {
		return accdao.findById(username);
	}

	@Override
	public Account finById(String username) {
		return accdao.findById(username).get();
	}

	@Override
	public Account findByUsername(String username) {
		// TODO Auto-generated method stub
		return accdao.findByUsername(username);
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return accdao.findAll();
	}

	@Override
	public Account update(Account account) {
		// TODO Auto-generated method stub
		return accdao.save(account);
	}

	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		 accdao.deleteById(username);
	}

	
}
