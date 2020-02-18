package com.flighto.util;

import java.math.BigInteger;
import java.util.HashMap;

import com.flighto.bean.Password;
import com.flighto.bean.User;


public class DummyData {

	
	
	HashMap<Integer,User> m = new HashMap<Integer,User>();
	public DummyData() 
	{
		m.put(1, new User("Student",BigInteger.valueOf(101),"Rakshit Dogra",new Password("rd123"),BigInteger.valueOf(896893558),"RakshitDogra101@gmail.com"));
		m.put(2, new User("Student",BigInteger.valueOf(102),"Hamza Hamal",new Password("hh123"),BigInteger.valueOf(987251186),"HamzaHamal102@gmail.com"));
		m.put(3, new User("Employee",BigInteger.valueOf(201),"Sumit Pandey",new Password("sp123"),BigInteger.valueOf(780019533),"SumitPandey201@gmail.com"));
		m.put(4, new User("Employee",BigInteger.valueOf(202),"Apurav Verma",new Password("av123"),BigInteger.valueOf(946363948),"ApuravVerma202@gmail.com"));

	
	}
	
	 public HashMap<Integer,User> getHashMap(){
		
		return m;
		
	}
	
	
}
