package com.game.server.packet;


public abstract class RequestFactory {
	
	public abstract Request getRequest();
	
	public abstract Handler getHandler();
}
