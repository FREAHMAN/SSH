package cm.wf.cache;

import org.apache.ibatis.session.SqlSession;

import cm.wf.tools.MybatisSessionFactory;
import cm.wf.vo.news;

public class SecondCache {
	public static void main(String[] args) {
		SqlSession session1 =MybatisSessionFactory.getSessionFactory().openSession();
		news voa = session1.selectOne("cm.wf.vo.mapping.NewsNS.findById",20);
		System.out.println(voa);
		session1.close(); //session 关闭后才会写入到缓存
		//MybatisSessionFactory.getSession().clearCache();//清除缓存
		System.out.println("****************************");
		//第一个session关闭后可以cache到
		SqlSession session2 =MybatisSessionFactory.getSessionFactory().openSession();
		news vob = session2.selectOne("cm.wf.vo.mapping.NewsNS.findById",20);
		System.out.println(vob);
	}
	
}
