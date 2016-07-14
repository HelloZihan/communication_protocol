package com.snaillove.standard.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.snaillove.standard.dao.SystemDao;
import com.snaillove.standard.model.Protocol;
import com.snaillove.standard.service.SystemService;

public class SystemServiceImpl implements SystemService {
	private SystemDao systemDao;

	@Override
	public List<Protocol> queryProtocol() {
		//查询逻辑
		return null;
	}
	@Resource(name = "systemDao")
	public SystemDao getSystemDao() {
		return systemDao;
	}
	public void setSystemDao(SystemDao systemDao) {
		this.systemDao = systemDao;
	}
	
}
