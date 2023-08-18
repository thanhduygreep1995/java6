package com.poly.service;

import java.util.List;
import java.util.Optional;

import com.poly.entity.AccountRole;
import com.poly.entity.Role;

public interface AccountRoleService {
	Optional<AccountRole> findByUsername(String username);
	 
	
}
