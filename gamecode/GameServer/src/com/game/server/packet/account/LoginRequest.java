package com.game.server.packet.account;

import com.game.server.buf.MessageBuffer;
import com.game.server.packet.Request;

public class LoginRequest extends Request {
	
	private String username;
	private String passwd;
	private int sid;
	
	public LoginRequest() {
		username = "";
		passwd = "";
		sid = 0;
	}
	
	public LoginRequest(String username, String passwd, int sid) {
		this.username = username;
		this.passwd = passwd;
		this.sid = sid;
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

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "LoginRequest [id=" + getId() + ", username=" + username + ", passwd=" + passwd
				+ ", sid=" + sid + "]";
	}
	
	@Override
	public void decodeBuffer(MessageBuffer buffer) {
		username = buffer.readString();
		passwd = buffer.readString();	
		sid = buffer.readInt();
	}

	
}
