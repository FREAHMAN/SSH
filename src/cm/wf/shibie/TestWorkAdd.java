package cm.wf.shibie;

import cm.wf.tools.MybatisSessionFactory;
import cm.wf.vo.Student;
import cm.wf.vo.Work;

public class TestWorkAdd {
	public static void main(String[] args) {
		Work work = new Work();
		work.setMid("bbb");
		work.setName("wanqi");
		work.setAge(28);
		work.setSalary(9990.99);
		work.setCompany("Tsla");
		
		MybatisSessionFactory.getSession().insert
		("cm.wf.vo.mapping.MembersNS.doCreateWork", work);
		MybatisSessionFactory.getSession().commit();
		MybatisSessionFactory.getSession().close();
	}
	
	
	
	

}
