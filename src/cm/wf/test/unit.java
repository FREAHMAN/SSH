package cm.wf.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cm.wf.vo.Member;

public class unit {
	public static void main(String[] args) {
		try {
			InputStream input = Resources.getResourceAsStream("mybatis.cfg.xml");
			
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);
			
			SqlSession session = factory.openSession();
			
			Member member = new Member();
			member.setMid("001");
			member.setAge(9);
			member.setName("fusheng");
			member.setSalary(30.00);
			member.setBirthday(new Date());
			
			int len = session.insert("cm.wf.vo.mapping.MemberNS.doCreate", member);
			System.out.println(len);
			session.commit();
			session.close();
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
