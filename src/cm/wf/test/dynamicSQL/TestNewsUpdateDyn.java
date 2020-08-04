package cm.wf.test.dynamicSQL;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
public class TestNewsUpdateDyn {
	public static void main(String[] args) {
		try {
			
			news no = new news();
			no.setNid(20);
			no.setTitle("搞个银河级新闻");
			System.out.println(MybatisSessionFactory.getSession().selectList(
					"cm.wf.vo.mapping.NewsNS.doUpdateDyn",no));
			MybatisSessionFactory.getSession().commit();
			MybatisSessionFactory.close();
//			System.out.println(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
