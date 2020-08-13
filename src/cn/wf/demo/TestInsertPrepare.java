package cn.wf.demo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import org.apache.naming.java.javaURLContextFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestInsertPrepare {
public static void main(String[] args) {
	//此方法可以通过applicationContext.xml进行配置
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	DriverManagerDataSource DataSource = ctx.getBean("dataSource",DriverManagerDataSource.class);
	JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSource);
	String sql = "insert into member(mid,name,age,sex,birthday,salary,note) "
			+ "values(?,?,?,?,?,?,?); ";
	int rows = jdbcTemplate.update(sql,new PreparedStatementSetter() {
		
		@Override
		public void setValues(PreparedStatement preparedStatement) throws SQLException {
			// TODO Auto-generated method stub
			preparedStatement.setString(1, "auto-insertPrepare");
			preparedStatement.setString(2, "longl");
			preparedStatement.setInt(3, 33);
			preparedStatement.setString(4, "女");
			preparedStatement.setDate(5, new java.sql.Date(new java.util.Date().getTime()));
			preparedStatement.setDouble(6, 99.00);
			preparedStatement.setString(7, "正是麻烦啊！！！");
		}
	} );
	System.out.println(rows);
	try {
		DataSource.getConnection().close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} //关闭数据库
}

}
