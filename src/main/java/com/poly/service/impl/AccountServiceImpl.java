package com.poly.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public <S extends Account> S save(S entity) {
		return accdao.save(entity);
	}

	@Override
	public List<Account> findAll() {
		return accdao.findAll();
	}

	@Override
	public <S extends Account> List<S> saveAll(Iterable<S> entities) {
		return accdao.saveAll(entities);
	}

	@Override
	public <S extends Account> Page<S> findAll(Example<S> example, Pageable pageable) {
		return accdao.findAll(example, pageable);
	}

	@Override
	public long count() {
		return accdao.count();
	}

	@Override
	public void delete(Account entity) {
		accdao.delete(entity);
	}

	@Override
	public void deleteAll() {
		accdao.deleteAll();
	}

	@Override
	public <S extends Account> List<S> findAll(Example<S> example) {
		return accdao.findAll(example);
	}

	@Override
	public <S extends Account> List<S> findAll(Example<S> example, Sort sort) {
		return accdao.findAll(example, sort);
	}

	@Override
	public Account getAccountByEmail(String email) {
		return accdao.getAccountByEmail(email);
	}

	@Override
	public Account findAccountByEmail(String email) {
		return accdao.findAccountByEmail(email);
	}

	
}
