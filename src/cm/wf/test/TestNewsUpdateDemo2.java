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
public class TestNewsUpdateDemo2 {
	public static void main(String[] args) {
		try {
			
			news vo = new news();
			vo.setTitle("搞个世界性大大新闻");
			vo.setPubdate(new Date() );
			vo.setNid(1);
			int len = MybatisSessionFactory.getSession().update(
					"cm.wf.vo.mapping.NewsNS.doUpdate", vo);
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
