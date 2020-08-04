package cm.wf.shibie;

import cm.wf.tools.MybatisSessionFactory;
import cm.wf.vo.Work;

public class TestWorkFindById{
	public static void main(String[] args) {
		Work work = 
		MybatisSessionFactory.getSession().selectOne
		("cm.wf.vo.mapping.MembersNS.findByWorkId","bbb");
		System.out.println(work.toString());
		MybatisSessionFactory.close();
	}
	
	
	
	

}
