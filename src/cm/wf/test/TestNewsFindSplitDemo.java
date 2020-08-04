package cm.wf.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class TestNewsFindSplitDemo {
	public static void main(String[] args) {
		try {
			String column ="title";
			String keyWord = "%%";
			int currentPage = 1;
			int lineSize = 5;
			Map<String, Object> map = new HashMap<String ,Object>();
			map.put("column", column);
			map.put("keyWord", keyWord);
			map.put("start", (currentPage-1)*lineSize);
			map.put("lineSize", lineSize);
			
			List<news> vo =
			MybatisSessionFactory.getSession().selectList(
					"cm.wf.vo.mapping.NewsNS.findAllSplit",map);
			MybatisSessionFactory.close();
//			System.out.println(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
