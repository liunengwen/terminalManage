package com.newland.controller;

import com.newland.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/ssomtms")
public class RouteController extends BaseController{
	
	@GetMapping(value = "index.html")
	public String index() throws InterruptedException {
		log.info("打开主页。。。");

		System.out.println(System.currentTimeMillis());
		if(log.isDebugEnabled())
			log.debug("测试性能", getName());



		System.out.println(System.currentTimeMillis());
		return "index/index";
	}
	
	public static String getName() throws InterruptedException {
		Thread.sleep(3000);
		return "刘能文";
	}

}
