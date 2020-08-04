package cm.wf.shibie;

import cm.wf.tools.MybatisSessionFactory;
import cm.wf.vo.Student;

public class TestStudentAdd {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setMid("aaa");
		stu.setName("zhangan");
		stu.setAge(8);
		stu.setSchool("清华");
		stu.setScore(90.0);;
		MybatisSessionFactory.getSession().insert("cm.wf.vo.mapping.MembersNS.doCreateStudent", stu);
		MybatisSessionFactory.getSession().commit();
		MybatisSessionFactory.getSession().close();
	}
	
	
	
	

}
