package com.chethan.webServices.rest.restfulwebservices.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFilter("SomeBeanFilter")
public class SomeBean {
	
	private String f1;
	//@JsonIgnore
	private String f2;
	private String f3;
	public SomeBean(String f1, String f2, String f3) {
		super();
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
	}
	public String getF1() {
		return f1;
	}
	public String getF2() {
		return f2;
	}
	public String getF3() {
		return f3;
	}
	
	

}
