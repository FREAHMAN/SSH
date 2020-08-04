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
public class TestNewsForeachDemo {
	public static void main(String[] args) {
		try {
			
			Set<Integer> set = new HashSet<>();
			set.add(22);
			set.add(23);
			set.add(24);
			List<news> vo =
			MybatisSessionFactory.getSession().selectList(
					"cm.wf.vo.mapping.NewsNS.findAllForeach",set.toArray());
			MybatisSessionFactory.close();
//			System.out.println(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
