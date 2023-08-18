package com.poly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poly.entity.Account;
import com.poly.entity.Role;
import com.poly.service.AccountRoleService;
import com.poly.service.ParamService;
import com.poly.service.SessionService;
import com.poly.service.impl.AccountServiceImpl;
import com.poly.service.impl.RoleServiceImpl;

@Controller
public class AdminController {
	@Autowired
	SessionService sessionService;

	@Autowired
	AccountServiceImpl accountServiceImpl;

	@Autowired
	ParamService paramService;
	@Autowired
	AccountRoleService accountRoleService;
	@Autowired
	RoleServiceImpl roleServiceImpl;
	

	@RequestMapping("/admin")
	public String index() {
		return "admin/_order";
	}
	

	@RequestMapping("/admin/account" )
	public String index1(Model model) {
		List<Role> roles = roleServiceImpl.findAll();
		List<Account> accounts = accountServiceImpl.findAll();
		String username = paramService.getString("edit", "");
		
		String usernamedelete = paramService.getString("delete", "");
		Account account = new Account();
		if (!username.equals("")) {
			account = accountServiceImpl.findByUsername(username);
		}
		
		if (!usernamedelete.equals("")) {
			accountServiceImpl.delete(usernamedelete);
		}
		String role = paramService.getString("role", "");
		System.out.println("role"+role);
		model.addAttribute("accounts", accounts);
		model.addAttribute("acc", account);
		model.addAttribute("roles", roles);
		return "admin/_account";
	}
	
	
	@RequestMapping("/admin/account/delete" )
	public String delete(Model model) {
		
		
		
		String usernamedelete = paramService.getString("delete", "");
		
		
		
		if (!usernamedelete.equals("")) {
			accountServiceImpl.delete(usernamedelete);
		}

		
		
		return "redirect:/admin/account";
	}
	

	@RequestMapping(path = "/admin/account", method = RequestMethod.POST)
	public String update(@ModelAttribute("account") Account account) {
		if (!account.getUsername().equals("")) {
			accountServiceImpl.update(account);
		}else {
			System.out.print("Error");
		}
		return "redirect:/admin/account";
	}

	@RequestMapping("/admin/category")
	public String index2() {
		return "admin/_category";
	}

	@RequestMapping("/admin/product")
	public String index3() {
		return "admin/_adproduct";
	}

	@RequestMapping("/admin/orderdetail")
	public String index4() {
		return "admin/_category";
	}
}
