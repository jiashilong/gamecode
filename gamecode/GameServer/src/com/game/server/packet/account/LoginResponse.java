package com.game.server.packet.account;

import com.game.server.buf.MessageBuffer;
import com.game.server.packet.Response;

public class LoginResponse extends Response {
	
	private String username;
	private String passwd;
	private int sid;
	
	public LoginResponse() {
		username = "";
		passwd = "";
		sid = 0;
	}
	
	public LoginResponse(String username, String passwd, int sid) {
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
		return "LoginResponse[id=" + getId() + ", username=" + username + ", passwd=" + passwd
				+ ", sid=" + sid + ", ret=" + getRet() + "]";
	}

	@Override
	public void encode(MessageBuffer buf) {
		buf.writeString(username);
		buf.writeString(passwd);
		buf.writeInt(sid);
	}

}
