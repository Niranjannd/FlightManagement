package com.flighto.bean;

public class Password {

	String p;
	
	public Password(){}
	
	public Password(String p) {
		super();
		this.p = p;
	}
	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}
	
	@Override
	public String toString() {
		return "Password [p=" + p + "]";
	}

}
