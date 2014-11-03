package com.game.util;

public class MessageUtil {
	
	private static long gid = 0;
	
	public static long getGID() {
		gid++;
		return gid;
	}
}
