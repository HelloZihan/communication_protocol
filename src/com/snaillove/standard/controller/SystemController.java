package com.snaillove.standard.controller;



import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snaillove.standard.service.SystemService;


@Controller
public class SystemController {
	private SystemService systemService;
	@RequestMapping(value="/hello")
	public String sayHello(ModelMap modelMap){
		System.out.print("-------------------");
		systemService.queryProtocol();
	
		return "/hello";
	}
	
	public SystemService getSystemService() {
		return systemService;
	}
	@Resource(name="systemService")
	public void setSystemService(SystemService systemService) {
		this.systemService = systemService;
	}	
	
}