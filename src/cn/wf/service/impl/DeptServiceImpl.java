package cn.wf.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.wf.dao.IDeptDAO;
import cn.wf.service.IDeptService;
import cn.wf.vo.Dept;

@Service
public class DeptServiceImpl implements IDeptService {
	
	@Resource //自动根据类型匹配
	private IDeptDAO deptDAO;
	
	@Override
	public boolean add(Dept dept) {
		// TODO Auto-generated method stub
		return this.deptDAO.doCreate(dept);
		
	}

}
