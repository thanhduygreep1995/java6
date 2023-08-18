package com.poly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poly.dao.RoleDao;
import com.poly.entity.Role;
import com.poly.service.RoleService;
@Service

public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleDao roleDao;
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roleDao.findAll() ;
	}
	
}
