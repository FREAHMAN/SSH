package cm.wf.shibie;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import cm.wf.tools.MybatisSessionFactory;
import cm.wf.vo.Student;

public class TestStudentFindById{
	public static void main(String[] args) {
		Student stu = 
		MybatisSessionFactory.getSession().selectOne
		("cm.wf.vo.mapping.MembersNS.findByStudentId","aaa");
		System.out.println(stu.toString());
		MybatisSessionFactory.close();
	}
	
	
	
	

}
