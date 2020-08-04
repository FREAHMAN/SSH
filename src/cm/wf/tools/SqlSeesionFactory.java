package cm.wf.tools;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSeesionFactory {

	public static SqlSessionFactory getFactory(){
		
		InputStream input;
		SqlSessionFactory factory = null;
		try {
			input = Resources.getResourceAsStream("mybatis.cfg.xml");
			 factory = new SqlSessionFactoryBuilder().build(input);
			 input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return factory;
		
	}
	
}
