package cn.wf.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import cn.wf.vo.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestSelect {
public static void main(String[] args) {
	//此方法可以通过applicationContext.xml进行配置
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	DriverManagerDataSource DataSource = ctx.getBean("dataSource",DriverManagerDataSource.class);
	JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSource);
	String sql = "select mid,name,age,sex,birthday,salary,note "
			+ "from member; ";
	List<Member> all =
	jdbcTemplate.query(sql,new RowMapper<Member>() {

		@Override
		public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			System.out.println("正在处理"+rowNum);
			Member vo = new Member();
			vo.setMid(rs.getString(1));
			vo.setName(rs.getString(2));
			vo.setAge(rs.getInt(3));
			vo.setSex(rs.getString(4));
			vo.setBirthday(rs.getDate(5));
			vo.setSalary(rs.getDouble(6));
			vo.setNote(rs.getString(7));
			return vo;
		}});
	
	
	System.out.println(all);
	
	try {
		DataSource.getConnection().close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} //关闭数据库
}

}
