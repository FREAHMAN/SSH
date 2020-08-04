package cm.wf.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cm.wf.tools.MybatisSessionFactory;
import cm.wf.tools.SqlSeesionFactory;
import cm.wf.vo.Member;
/**
 * 利用自定义工厂来处理SQL
 * @author root-qiao
 *
 */
public class unit3 {
	public static void main(String[] args) {
		try {
			
			Member member = new Member();
			member.setMid("004");
			member.setAge(9);
			member.setName("pengpeng");
			member.setSalary(35.00);
			member.setBirthday(new Date());
			
			int len = MybatisSessionFactory.getSession().insert("cm.wf.vo.mapping.MemberNS.doCreate", member);
			System.out.println(len);
			MybatisSessionFactory.getSession().commit();
			MybatisSessionFactory.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
