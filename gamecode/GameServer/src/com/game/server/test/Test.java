package com.game.server.test;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;

class T {
	short a;
	int b;
	long c;
}
public class Test {

	public static void main(String[] args) {
		ChannelBuffer cb = ChannelBuffers.dynamicBuffer();
		System.out.println(cb.capacity());
		cb.writeInt(1);
		cb.writeShort(1);
		System.out.println(cb.writerIndex());
	}

}
