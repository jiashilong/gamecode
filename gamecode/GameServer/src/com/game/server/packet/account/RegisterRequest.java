package com.game.server.packet.account;

import com.game.server.buf.MessageBuffer;
import com.game.server.packet.Request;

public class RegisterRequest extends Request {
	
	private String username;
	private String passwd;
	
	public RegisterRequest() {
		username = "";
		passwd = "";
	}
	
	public RegisterRequest(String username, String passwd) {
		this.username = username;
		this.passwd = passwd;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "RegisterRequest[id=" + getId() + ", username=" + username + ", passwd=" + passwd
				+ "]";
	}

	@Override
	public void decodeBuffer(MessageBuffer buffer) {
		username = buffer.readString();
		setUsername(username);
	
		passwd = buffer.readString();
		setPasswd(passwd);
	}

}
