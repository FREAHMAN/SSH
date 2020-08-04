package cm.wf.cache;

import cm.wf.tools.MybatisSessionFactory;
import cm.wf.vo.news;

public class FristCache3 {
	public static void main(String[] args) {
		news voa = MybatisSessionFactory.getSession().selectOne("cm.wf.vo.mapping.NewsNS.findById",20);
		System.out.println(voa);
		voa.setTitle("222222");
		MybatisSessionFactory.getSession().clearCache();//清除缓存
		System.out.println("****************************");
		news vob = MybatisSessionFactory.getSession().selectOne("cm.wf.vo.mapping.NewsNS.findById",20);
		System.out.println(vob);
	}
	
}
