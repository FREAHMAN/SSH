package cm.wf.tools;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 本类负责sqlSessionFactory sqlSession 的取得
 * @author root-qiao
 *
 */
public class MybatisSessionFactory {
	private static final String config_file="mybatis.cfg.xml";
	private static  ThreadLocal<SqlSession>  THREAD_LOCAL = new ThreadLocal<SqlSession>();
	private static  SqlSessionFactory FACTORY = null;
	private static InputStream input = null;
	
	static{
		rebuildSessionFactory();
	}
	/**
	 * 取得session
	 * @return
	 */
	public static SqlSession getSession(){
		SqlSession session = THREAD_LOCAL.get();
		if(session == null){
			if(FACTORY == null){
				rebuildSessionFactory();
			}
			session = FACTORY.openSession();
			THREAD_LOCAL.set(session);
		}
		return session;
	}
	
	public static SqlSessionFactory getSessionFactory(){
		return FACTORY;
	}
	
	public static void rebuildSessionFactory (){
		try {
			input = Resources.getResourceAsStream(config_file);
			FACTORY = new SqlSessionFactoryBuilder().build(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void close(){
		SqlSession session = THREAD_LOCAL.get();
		THREAD_LOCAL.set(null);
		if(session!=null){
			session.close();
		}
		if(input!=null){
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

