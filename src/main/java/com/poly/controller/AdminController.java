package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	  @RequestMapping("/admin/account")
	    public String index1() {
	        return "admin/_account";
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
	  
		@RequestMapping({ "admin", "admin/dashboard" })
		public String detail(Model model) {
//			model.addAttribute("acc", accService.findAll().size());
//			model.addAttribute("total", ordService.getTotal());
//			model.addAttribute("order", ordService.findAll().size());

			return "admin/_dashboard";
		}
}
