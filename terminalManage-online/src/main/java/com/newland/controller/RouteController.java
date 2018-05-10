package com.newland.controller;

import com.newland.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/ssomtms")
public class RouteController extends BaseController{
	
	@GetMapping(value = "index.html")
	public String index() {
		log.info("打开主页。。。");
		return "index/index";
	}
	

}
