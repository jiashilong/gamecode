package com.game.server.packet;

public abstract class Handler {
	
	public abstract Response handle(Request request);
	
}
