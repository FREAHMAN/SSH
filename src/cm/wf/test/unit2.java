package cm.wf.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cm.wf.tools.SqlSeesionFactory;
import cm.wf.vo.Member;

public class unit2 {
	public static void main(String[] args) {
		try {
			//通过tool包中自定义的方法实现factory只实例化一次避免多次实例化
			SqlSessionFactory factory = SqlSeesionFactory.getFactory();
			
			SqlSession session = factory.openSession();
			
			Member member = new Member();
			member.setMid("003");
			member.setAge(9);
			member.setName("binbin");
			member.setSalary(35.00);
			member.setBirthday(new Date());
			
			int len = session.insert("cm.wf.vo.mapping.MemberNS.doCreate", member);
			System.out.println(len);
			session.commit();
			session.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
