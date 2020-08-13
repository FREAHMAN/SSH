package cn.wf.dao.impl;

import org.springframework.stereotype.Component;
import cn.wf.dao.IDeptDAO;
import cn.wf.vo.Dept;
//@Component 为dao层的annotation 
//@Service 为service层
//@Repository 为 控制层
@Component
public class IDeptDAOImpl implements IDeptDAO {

	@Override
	public boolean doCreate(Dept dept) {
		// TODO Auto-generated method stub
		System.out.println("数据增加完成！！");
		return true;
	}

}
