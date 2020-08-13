package cn.wf.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wf.factory.ServiceFactory;
import cn.wf.service.IMessage;
import cn.wf.service.impl.MessageImpl;

public class TestMessage {
	public static void main(String[] args) {
//		IMessage message = new MessageImpl();  //直接用new实例化
//		IMessage message = ServiceFactory.getIMessageInstance(); //工厂类
		ClassPathXmlApplicationContext cxt = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); //Spring
		IMessage message = cxt.getBean("msg",IMessage.class);
		System.out.println(message.getMessage());
		
	}
}
