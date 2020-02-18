package com.flighto.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

import com.flighto.bean.Password;
import com.flighto.bean.User;
import com.flighto.dao.UsersData;

public class UserServiceImpl implements ServiceInterface{
	User u;
	UsersData ud=new UsersData();

	
	@Override
	public void addUser()
	{
		
   		ud.addUser();
		System.out.println("*****User Added Successfully*****");

	}
	
	
	@Override
	public User viewUser() 
	{
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an ID");
		BigInteger userId=s.nextBigInteger();
		return ud.viewUser(userId);

	}
	
	@Override
	public List<User>  print()
	{
		return ud.print();
	}
	
	
	@Override
	public User updateUser()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the ID you want to Update");
		BigInteger userId=s.nextBigInteger();
		return ud.updateUser(userId);
		
	}
	
	
	
	
	@Override
	public User deleteUser()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the ID you want to delete");
		BigInteger userId=s.nextBigInteger();
		return ud.deleteUser(userId);
	}


}
