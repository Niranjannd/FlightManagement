package com.flighto.service;

public interface Validation {

	
	String a = "[1-9][0-9][0-9]";
	String b = "[1-9][0-9][0-9][0-9]";
	String c = "[1-9][0-9][0-9][0-9]";
	String d = "[A-Z]*";
	String pattern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	
public static boolean validateData(String data,String a)
{
	return data.matches(a);
}
}
