package com.game.server.socket;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.frame.FrameDecoder;

import com.game.server.buf.MessageBuffer;
import com.game.server.packet.Request;
import com.game.server.packet.RequestFactory;
import com.game.server.packet.RequestFactoryManager;
import com.game.util.Debugger;
import com.game.util.MessageUtil;

public class SocketDecoder extends FrameDecoder {
	
	// package size and message id
	private static final int HEAD_SIZE = 8;
	
	@Override
	protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer) throws Exception {
		// Make sure if the length field and message id field were received.
		if(buffer.readableBytes() < HEAD_SIZE) {
			// The length field and message id field were not received yet - return null.
	        // This method will be invoked again when more packets are
	        // received and appended to the buffer.
			return null;
		}
		
		// The length field is in the buffer.
	    // Mark the current buffer position before reading the length field
	    // because the whole frame might not be in the buffer yet.
	    // We will reset the buffer position to the marked position if
	    // there's not enough bytes in the buffer.
		buffer.markReaderIndex();
		
		// Read the length field.
		int length = buffer.readInt();
		if(buffer.readableBytes() < length) {
			// The whole bytes were not received yet - return null.
	        // This method will be invoked again when more packets are
	        // received and appended to the buffer.
	        // Reset to the marked position to read the length field again
	        // next time.
			buffer.resetReaderIndex();
			return null;
		}
		
		// Read the message id field.
		int id = buffer.readInt();
		try {
			RequestFactory factory = RequestFactoryManager.instance().getFactory(id);
			if(factory == null) {
	        	throw new NullPointerException("request factory is null");
	        }
			Request request = factory.getRequest();
			request.setId(id);
			MessageBuffer msgbuf = new MessageBuffer(buffer);
			request.decodeBuffer(msgbuf);
			Debugger.log("global message id:" + MessageUtil.getGID());
			Debugger.log(request.toString());
			return request;
		} catch(NullPointerException e) {
			Debugger.err("request factory is null: " + id);
			e.printStackTrace();
			System.exit(0); //此处应该向客户端返回错误码
		}
		
		return null;
	}

}
