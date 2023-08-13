package com.poly.rest.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/account-role")
public class AccountRoleRestController {
    
    @RequestMapping("/security")
    @ResponseBody
    public Object getAuth(HttpSession session) {
        return session.getAttribute("authentication");
    }
}
