package com.flighto.dao;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import com.flighto.bean.Password;
import com.flighto.bean.User;
import com.flighto.service.Validation;
import com.flighto.util.DummyData;

public class UsersData 
{
		
	User u = new User();
	Scanner s = new Scanner(System.in);
	Password userPassword;
	DummyData d = new DummyData();
	int i =0;
	HashMap<Integer,User> m = d.getHashMap();

	public void addUser()
	{
		System.out.println("Enter the User Type:");
		String userType = s.next();
		u.setUserType(userType);
		
		
		System.out.println("Enter User ID:");
		BigInteger userId = s.nextBigInteger();
		
	
	    boolean val = true;
		while(val)
		{
		
			String st = String.valueOf(userId);
			boolean c=Validation.validateData(st,Validation.a);
			if(c==true)
			{
				System.out.println("valid id");
				u.setUserId(userId);
				val = false;
				
			}
			else
			{
				System.out.println("incorrect id please enter again");
				userId=s.nextBigInteger();
			}
			
		}
		
		
		
		System.out.println("Enter User's Name:");
		String userName = s.next();
		u.setUserName(userName);
		System.out.println("Enter Password:");
		userPassword = new Password(s.next());
		u.setUserPassword(userPassword);	
		System.out.println("Enter Phone Number:");
		BigInteger userPhone = s.nextBigInteger();
		u.setUserPhone(userPhone);
		System.out.println("Enter Email Address");
		String userEmail = s.next();
		u.setUserEmail(userEmail);		
		i++;
		m.put(i,u);
	 }
	
	
	
	public User viewUser(BigInteger userId)
	{
		for(Map.Entry<Integer, User> map: m.entrySet())
		{
			if(map.getValue().getUserId().compareTo(userId) == 0) {
				System.out.println(map.getValue());
				return map.getValue();
			}
		}
		System.out.println("nulls");
		 return null;
	}
		
	
	
	public List<User> print()
	{
		List<User> ar = new ArrayList<User>();
		 for(Map.Entry<Integer, User> map : m.entrySet())
		 {
			 ar.add(map.getValue());
		 }
		 return ar;
	}
	
	public User updateUser(BigInteger userId) 
	{
		for(Map.Entry<Integer, User> map : m.entrySet())
		{
			if(map.getValue().getUserId().compareTo(userId)==0) 
			{
				System.out.println("Enter new User Type for ID: " + userId);
				map.getValue().setUserType(s.next());
				System.out.println("Enter new User Name for ID: " + userId);
				map.getValue().setUserName(s.next());
				System.out.println("Enter new User Password for ID: " + userId);
				map.getValue().setUserPassword(new Password(s.next()));
				System.out.println("Enter new User Phone No for ID: " + userId);
				map.getValue().setUserPhone(s.nextBigInteger());
				System.out.println("Enter new User Email for ID: " + userId);
				map.getValue().setUserEmail(s.next());
				System.out.println("****Successfull Updated****");	
			}	
				
		}
		return null;
	}
	
	public User deleteUser(BigInteger userId) 
	{
		for(Map.Entry<Integer, User> map : m.entrySet())
		{
			if(map.getValue().getUserId().compareTo(userId)==0) 
			{
				m.remove(map.getKey());	
			}		
		}
		return null;
	}
}
