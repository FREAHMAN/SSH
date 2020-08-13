package cn.wf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wf.vo.Dept;

public class TestDept1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext cxt = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		Dept dept = cxt.getBean("dept", Dept.class);
		System.out.println(dept);
	}

}
