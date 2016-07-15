package com.snaillove.standard.controller;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snaillove.standard.model.Protocol;
import com.snaillove.standard.service.SystemService;


@Controller
public class SystemController {
	private SystemService systemService;
	@RequestMapping(value="/index")
	public String index(){
		System.out.print("-------------------");
		return "/index";
	}
	@RequestMapping(value="/query")
	public String query(){
		System.out.print("-------------------++++++++++++++");
		List<Protocol> list = systemService.queryProtocol();
		System.out.println(systemService.queryProtocol());		
		return "/index";
	}
	public SystemService getSystemService() {
		return systemService;
	}
	@Resource(name="systemService")
	public void setSystemService(SystemService systemService) {
		this.systemService = systemService;
	}	
	
}