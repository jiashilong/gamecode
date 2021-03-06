package com.game.server.packet.account;

import com.game.server.packet.Handler;
import com.game.server.packet.Request;
import com.game.server.packet.RequestFactory;

public class RegisterFactory extends RequestFactory {

	@Override
	public Request getRequest() {
		return new RegisterRequest();
	}

	@Override
	public Handler getHandler() {
		return new RegisterHandler();
	}

}
