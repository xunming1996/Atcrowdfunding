package com.atguigu.atcrowdfunding.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.atcrowdfunding.service.TAdminService;

@Controller
public class DispatcherController {
	
	Logger logger = LoggerFactory.getLogger(DispatcherController.class);
	
	@Autowired
	TAdminService adminService;
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		
		logger.debug("");
		return "login";
	}

	@RequestMapping("/doLogin")
	public String doLogin(String loginacct,String userpswd) {
		
		//{}大括号相当于占位符，第二个参数loginacct向{}中传递参数
		logger.debug("loginacct={}",loginacct);
		logger.debug("userpswd={}", userpswd);
		return "login";
	}

}
