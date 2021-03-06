package com.game.server.packet;

import java.nio.charset.Charset;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

import com.game.server.buf.MessageBuffer;

public abstract class Response {

	private int id;
	int ret;
	protected MessageBuffer buf = new MessageBuffer(ChannelBuffers.dynamicBuffer());
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public int getRet() {
		return ret;
	}

	public void setRet(int ret) {
		this.ret = ret;
	}
	
	public ChannelBuffer encodeAll() {
		ChannelBuffer cb = ChannelBuffers.dynamicBuffer();
		encode(buf);
		int bufSize = buf.writerIndex();
		int packSize = 8 + bufSize + 4;
		cb.writeInt(packSize);
		cb.writeInt(id);
		String str = buf.toString(Charset.forName("utf-8"));
		cb.writeBytes(str.getBytes());
		cb.writeInt(ret);
		return cb;
	}
	public abstract void encode(MessageBuffer buf);
}
