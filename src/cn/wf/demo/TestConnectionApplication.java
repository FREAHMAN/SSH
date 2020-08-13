package cn.wf.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConnectionApplication {
public static void main(String[] args) {
	//此方法可以通过applicationContext.xml进行配置
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	DriverManagerDataSource DataSource = ctx.getBean("dataSource",DriverManagerDataSource.class);
	System.out.println(DataSource);
}

}
