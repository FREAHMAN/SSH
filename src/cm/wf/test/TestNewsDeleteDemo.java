package cm.wf.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.javassist.compiler.ast.NewExpr;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cm.wf.tools.MybatisSessionFactory;
import cm.wf.tools.SqlSeesionFactory;
import cm.wf.vo.Member;
import cm.wf.vo.news;
/**
 * 利用自定义工厂来处理SQL
 * @author root-qiao
 *
 */
public class TestNewsDeleteDemo {
	public static void main(String[] args) {
		try {
			
			news vo = new news();
			
			vo.setNid(3);
			
			int len = MybatisSessionFactory.getSession().delete(
					"cm.wf.vo.mapping.NewsNS.doRemove", vo);
			System.out.println(len);
			System.out.println("-------"+vo.getNid());
			MybatisSessionFactory.getSession().commit();
			MybatisSessionFactory.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
