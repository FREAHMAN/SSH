package cn.wf.factory;

import cn.wf.service.IMessage;
import cn.wf.service.impl.MessageImpl;

public class ServiceFactory {
	public static IMessage getIMessageInstance() {
		return new MessageImpl();
		
	}
}
