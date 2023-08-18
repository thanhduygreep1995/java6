package com.poly.controller;




import javax.swing.JOptionPane;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.dto.AccountDTO;
import com.poly.entity.Account;
import com.poly.service.AccountService;

import lombok.Data;

@Controller
public class SignUpController {
	@Autowired
	AccountService accountService;
	
	@RequestMapping("/home/sign")
	public String showPageSignUp() {
		return "layout/_SignUp";
	}
	
	@PostMapping("save")
	public String saveOrUpdate(@RequestParam("username") String username, 
			@RequestParam("password") String password,@RequestParam("fullname") String fullname, 
			@RequestParam("email") String email,@RequestParam("confirmPassword") String confirmPassword , ModelMap model,@Valid @ModelAttribute("account") AccountDTO dto, BindingResult result){
		Account entity = new Account();
		
		BeanUtils.copyProperties(dto, entity);
		 if(result.hasErrors()) {
			 if(fullname == null ||fullname.isEmpty()) {
				 model.addAttribute("messga2","Tên không được trống");
			 }
			 if(email == null|| email.isEmpty()) {
				 model.addAttribute("messga3","Email không được trống");
			 }
			 if(username == null ||username.isEmpty()) {
				 model.addAttribute("messga","Tên tài khoản không được trống");
			 }else if(username.length()<6) {
				 model.addAttribute("messga","Tên tài khoản phải hơn 6 ký tự");
			 }
			 if(password == null ||password.isEmpty()) {
				 model.addAttribute("messga1","Mật khẫu không được trống");
			 }else if(password.length()<6) {
				 model.addAttribute("messga1","Mật khẫu phải hơn 6 ký tự");
			 }
			 if (!password.equals(confirmPassword)) {
		            model.addAttribute("errorMessage", "Mật khẩu không khớp");
		        }
			 	
			 return "layout/_SignUp";
			 
		 }else {
			 			 
			 accountService.save(entity);
		 }
		 model.addAttribute("messageSucces","Đăng ký thành công");
		return "layout/_login";
	}
	
	
}
