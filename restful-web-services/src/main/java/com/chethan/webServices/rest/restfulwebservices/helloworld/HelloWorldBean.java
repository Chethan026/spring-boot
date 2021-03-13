package com.chethan.webServices.rest.restfulwebservices.helloworld;

public class HelloWorldBean {
	
	String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloWorldBean(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

}
