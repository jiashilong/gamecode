package com.game.server.packet.account;

import com.game.server.packet.Handler;
import com.game.server.packet.Request;
import com.game.server.packet.Response;
import com.game.util.Debugger;

public class RegisterHandler extends Handler {

	@Override
	public Response handle(Request request) {
		RegisterRequest registerRequest = (RegisterRequest)request;
		String username = registerRequest.getUsername();
		String passwd = registerRequest.getPasswd();
		
		if(username!=null&&!username.equals("") && passwd!=null&&!passwd.equals("")) {
			Debugger.log("register ok");
		}
		
		RegisterResponse resp = new RegisterResponse(username, passwd);
		resp.setId(registerRequest.getId()+1);
		resp.setRet(1);
		
		return resp;
	}

}
