package com.game.server.packet.account;

import com.game.server.packet.Handler;
import com.game.server.packet.Request;
import com.game.server.packet.Response;
import com.game.util.Debugger;

public class LoginHandler extends Handler {

	@Override
	public Response handle(Request request) {
		LoginRequest loginRequest = (LoginRequest)request;
		String username = loginRequest.getUsername();
		String passwd = loginRequest.getPasswd();
		int sid = loginRequest.getSid();
		
		if(username != null && !username.equals("") && 
		   passwd != null && !passwd.equals("") && 
		   sid != 0) {
			Debugger.log("login ok");
		} else {
			Debugger.log("login error");
		}
		
		LoginResponse resp = new LoginResponse(username, passwd, sid);
		resp.setId(loginRequest.getId()+1);
		resp.setRet(1);
		return resp;
	}

}
