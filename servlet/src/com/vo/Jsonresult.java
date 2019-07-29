package com.vo;
/**
 *    
 * @author Administrator
 *
 */
public class Jsonresult {
	private String status;
	private String message;
	private Object data;
	public Jsonresult(String status,String message,Object data) {
		this.data=data;
		this.message=message;
		this.status=status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
