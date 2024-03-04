package com.statolumn;

public class Client {
	private String clientid;
	private String secret;
	private String accessToken;
	
	public Client(String clientid, String secret) {
		this.clientid = clientid;
		this.secret = secret;
	}
	
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	public String getAccessToken() {
		return this.accessToken;
	}
}
