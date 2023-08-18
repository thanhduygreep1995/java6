package com.poly.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poly.entity.Account;
@Service
public interface AccountService {
	Optional<Account> findById(String username);
	
	Account finById(String username);
	
	Account findByUsername(String username);

	<S extends Account> List<S> findAll(Example<S> example, Sort sort);

	<S extends Account> List<S> findAll(Example<S> example);

	void deleteAll();

	void delete(Account entity);

	long count();

	<S extends Account> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Account> List<S> saveAll(Iterable<S> entities);

	List<Account> findAll();

	<S extends Account> S save(S entity);

	Account findAccountByEmail(String email);

	Account getAccountByEmail(String email);
}
