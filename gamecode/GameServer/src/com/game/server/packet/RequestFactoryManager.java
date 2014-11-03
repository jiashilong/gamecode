package com.game.server.packet;

import java.util.HashMap;
import java.util.Map;

import com.game.server.packet.account.LoginFactory;
import com.game.server.packet.account.RegisterFactory;

public class RequestFactoryManager {
	
	private static Map<Integer,RequestFactory> requestFactoryMap = new HashMap<Integer,RequestFactory>();
	private static RequestFactoryManager manager = new RequestFactoryManager();
	
	private RequestFactoryManager() {}
	
	public static RequestFactoryManager instance() {
		return manager;
	}
	
	public void init() {
		requestFactoryMap.put(1000, new RegisterFactory());
		requestFactoryMap.put(1002, new LoginFactory());
	}
	
	public RequestFactory getFactory(int id) {
		return requestFactoryMap.get(id);
	}
}
