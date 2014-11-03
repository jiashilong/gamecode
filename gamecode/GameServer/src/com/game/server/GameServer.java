package com.game.server;

import com.game.server.packet.RequestFactoryManager;
import com.game.server.socket.SocketServer;

public class GameServer {

	public static void main(String[] args) {
		RequestFactoryManager.instance().init();
		SocketServer server = new SocketServer();
		server.start();
	}

}
