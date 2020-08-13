package cn.wf.demo;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestConnection {
public static void main(String[] args) {
	//此方法可以通过applicationContext.xml进行配置
	DriverManagerDataSource DataSource = new DriverManagerDataSource();
	DataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	DataSource.setUrl("jdbc:mysql://localhost:3306/jdbc");
	DataSource.setUsername("root");
	DataSource.setPassword("root");
	System.out.println(DataSource);
}

}
