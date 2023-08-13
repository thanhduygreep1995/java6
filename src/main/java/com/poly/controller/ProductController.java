package com.poly.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.entity.Account;
import com.poly.entity.Product;
import com.poly.service.ProductService;
import com.poly.service.SessionService;

@Controller
@RequestMapping()
public class ProductController {
	@Autowired
	ProductService productService;

	@Autowired
	SessionService session;

	@RequestMapping("/product/list")
	public String list() {
		return "product/_list";
	}

	@RequestMapping("/product/detail/{id}")
	public String detail(Model model, @PathVariable("id") Integer id) {
		Product item = productService.findById(id);
		model.addAttribute("items", item);
		return "product/_detail";
	}

	@RequestMapping("/product/cart")
	public String cart() {

		return "cart/_cart";
	}

	@RequestMapping("/cart/pay")
	public String checkoutShoppingCart (Model model) {	
		Account currentUser = session.getAttribute("account");
		if (currentUser == null) {
			model.addAttribute("message", "Vui Lòng Đăng Nhập Để Tiếp Tục");
			return "layout/_login";
		}
		return "redirect:/home/cart";
	}

	@RequestMapping("/cart/checkout")
	public String pageCheckout(Model model) {
		return "cart/check-out";
	}

}
