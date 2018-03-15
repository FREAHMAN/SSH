package com.exam.test;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


import com.mysql.jdbc.Connection;

public class JdbcA {
 public static void main(String[] args) throws Exception {
	
	DriverManagerDataSource source = new DriverManagerDataSource();
	source.setDriverClassName("org.gjt.mm.mysql.Driver");
	source.setUrl("jdbc:mysql://localhost:3306/test");
	source.setUsername("test");
	source.setPassword("111suzhi111");
	Connection conn = (Connection) source.getConnection();
	System.out.println(conn);
}
}
