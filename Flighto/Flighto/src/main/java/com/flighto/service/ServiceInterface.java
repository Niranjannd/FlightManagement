package com.flighto.service;

import java.math.BigInteger;
import java.util.List;

import com.flighto.bean.User;

public interface ServiceInterface {
	
	public User viewUser();
	public void addUser();
	public List<User> print();
	public User updateUser();
	public User deleteUser();
	
	
	
	
}
