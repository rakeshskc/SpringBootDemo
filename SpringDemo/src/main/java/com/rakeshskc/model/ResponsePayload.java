package com.rakeshskc.model;

import java.util.Map;

public class ResponsePayload {
	
	private String msg;
	private String status;
	private Map<String,String> result;
	
	public Map<String, String> getResult() {
		return result;
	}
	public void setResult(Map<String, String> result) {
		this.result = result;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ResponsePayload(String msg, String status) {
		this.msg = msg;
		this.status = status;
	}
	
}
