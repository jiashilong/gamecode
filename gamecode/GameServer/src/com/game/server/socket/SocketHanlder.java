package com.game.server.socket;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

import com.game.server.packet.Handler;
import com.game.server.packet.Request;
import com.game.server.packet.RequestFactory;
import com.game.server.packet.RequestFactoryManager;
import com.game.server.packet.Response;
import com.game.util.Debugger;

public class SocketHanlder extends SimpleChannelHandler {
	
	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
		Debugger.log("accept a client");
	}
	
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        Request request = (Request)e.getMessage();
        int id = request.getId();
        try{
	        RequestFactory factory = RequestFactoryManager.instance().getFactory(id);
	        if(factory == null) {
	        	throw new NullPointerException("request cactory is null");
	        }
	        
	        Handler handler = factory.getHandler();
	        Response resp = handler.handle(request);
	        Debugger.err(resp.toString());
	        ChannelBuffer buf = resp.encodeAll();
	        Channel ch = e.getChannel();
	        ch.write(buf);
        } catch(NullPointerException ex) {
        	ex.printStackTrace();
        }
    }
	
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {

	}
	
	public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
       Debugger.log("a client close");
    }
	
}
