package cn.wf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wf.vo.Dept;
import cn.wf.vo.Emp;

public class TestDept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cxt = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		Emp emp = cxt.getBean("emp", Emp.class);
		System.out.println(emp);
//		cxt.registerShutdownHook();//注销
	}

}
