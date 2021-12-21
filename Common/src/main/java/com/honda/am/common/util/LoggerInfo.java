package com.honda.am.common.util;

import java.time.LocalDateTime;

public class LoggerInfo {
	private String error;
	private String message;
	private LocalDateTime timeStamp;
	private int status;
	
	public LoggerInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public LoggerInfo(String error, String message) {
		super();
		this.error = error;
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int i) {
		this.status = i;

	}

}
