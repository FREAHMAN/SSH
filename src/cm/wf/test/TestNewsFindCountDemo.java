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
public class TestNewsFindCountDemo {
	public static void main(String[] args) {
		try {
			
			Integer  counts =
			MybatisSessionFactory.getSession().selectOne(
					"cm.wf.vo.mapping.NewsNS.findCount");
			MybatisSessionFactory.close();
			System.out.println("总共"+counts+"条");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
