package cn.wf.demo;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestInsert {
public static void main(String[] args) {
	//此方法可以通过applicationContext.xml进行配置
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	DriverManagerDataSource DataSource = ctx.getBean("dataSource",DriverManagerDataSource.class);
	JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSource);
	String sql = "insert into member(mid,name,age,sex,birthday,salary,note) "
			+ "values(?,?,?,?,?,?,?); ";
	int rows = jdbcTemplate.update(sql, "auto-insert","zhangsan",9,"女",new Date(),90.99,"ooo");
	System.out.println(rows);
	try {
		DataSource.getConnection().close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} //关闭数据库
}

}
