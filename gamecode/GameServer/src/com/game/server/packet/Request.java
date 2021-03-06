package com.game.server.packet;

import com.game.server.buf.MessageBuffer;

public abstract class Request {
	
	private int id;

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public abstract void decodeBuffer(MessageBuffer buffer);
}
