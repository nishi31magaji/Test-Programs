package com.yodlee.test;

import java.util.HashMap;
import java.util.Map;

public class Status {
	private String desc;

	private int userStatus;


	private Status(int userStatus, String desc) {
		this.userStatus = userStatus;
		this.desc = desc;
	}
	public static final Status DELETED_USER = new Status(3, "DELETED:User account deleted!");
	public int intValue() {

		return userStatus;
	}
	 public int getUserStatus () { 
	        return userStatus;
	    } 
	 
	 static Map userStatuses = new HashMap();
		static {
			
			userStatuses.put(Integer.valueOf(3), DELETED_USER);
				
		}
	
}
