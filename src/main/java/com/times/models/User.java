package com.times.models;

public class User {
	
//Any user be it admin or normal user
	private int userId;
	private Search searchObj;
	public User(int userId, Search searchObj) {
		super();
		this.userId = userId;
		this.searchObj = searchObj;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Search getSearchObj() {
		return searchObj;
	}
	public void setSearchObj(Search searchObj) {
		this.searchObj = searchObj;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", searchObj=" + searchObj + "]";
	}

	

}
