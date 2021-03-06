package com.game.server.socket;

import java.net.InetSocketAddress;
import java.nio.ByteOrder;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.buffer.HeapChannelBufferFactory;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

import com.game.util.Debugger;

public class SocketServer {
	
	private String host;
	private int port;
	private ServerBootstrap bootstrap;
	
	public SocketServer() {
		host = "localhost";
		port = 8080;
		init();
	}
	
	public SocketServer(String host, int port) {
		this.host = host;
		this.port = port;
		init();
	}
	
	private void init() {
		bootstrap = new ServerBootstrap();
		bootstrap.setOption("reuseAddress", true);
		bootstrap.setOption("child.tcpNoDelay", true);
		bootstrap.setOption("child.receiveBufferSize", 4*1024*1024);
		bootstrap.setOption("child.sendBufferSize", 4*1024*1024);
		bootstrap.setOption("child.keepAlive", true);
		Debugger.log("cpu: big_endian");
		bootstrap.setOption("child.bufferFactory", new HeapChannelBufferFactory(ByteOrder.BIG_ENDIAN));
//		if(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
//			Debugger.log("cpu: big_endian");
//			bootstrap.setOption("child.bufferFactory", new HeapChannelBufferFactory(ByteOrder.BIG_ENDIAN));
//		} else {
//			Debugger.log("cpu: little_endian");
//			bootstrap.setOption("child.bufferFactory", new HeapChannelBufferFactory(ByteOrder.LITTLE_ENDIAN));
//		}
		
		ChannelFactory factory = new NioServerSocketChannelFactory(Executors.newCachedThreadPool(), Executors.newCachedThreadPool());
		bootstrap.setFactory(factory);
		bootstrap.setPipelineFactory(new SocketPipelineFactory());
		
	}
	
	public void start() {
		bootstrap.bind(new InetSocketAddress(host, port));
		Debugger.log("socket start ok, listen " + host + ":" + port);
	}
}
