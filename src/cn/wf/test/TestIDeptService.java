package cn.wf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.wf.service.IDeptService;
import cn.wf.vo.Dept;

public class TestIDeptService {
	public static void main(String[] args) {
//		IMessage message = new MessageImpl();  //直接用new实例化
//		IMessage message = ServiceFactory.getIMessageInstance(); //工厂类
		ClassPathXmlApplicationContext cxt = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); //Spring
		IDeptService deptss = cxt.getBean("deptServiceImpl",IDeptService.class);
		
		Dept vo = new Dept();
		vo.setDeptno(1);
		vo.setDname("long");
		vo.setLoc("beijing");
		System.out.println(deptss.add(vo));
		
	}
}
