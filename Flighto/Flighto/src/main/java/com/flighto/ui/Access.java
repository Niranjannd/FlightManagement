package com.flighto.ui;
import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;
import com.flighto.bean.User;
import com.flighto.service.UserServiceImpl;

public class Access {

public static void main(String[] args)
	{
		 UserServiceImpl us = new UserServiceImpl();

	boolean t = true;
	
	while(t) {
		
		System.out.println("Chose one option below - ");
		System.out.println("1. Add a New User:");
		System.out.println("2. Search a User using ID:");
		System.out.println("3. Show Details of all Users:");
		System.out.println("4. Update a User:");
		System.out.println("5. Delete a User Details:");

		
		Scanner s = new Scanner(System.in);
		int i =s.nextInt();
		
		
	switch(i)
	
	{
	case 1:
		 
		us.addUser();
	
		break;
		
	case 2:
		
		us.viewUser();
		break;
	
			
	case 3:
			List<User> list = us.print();
			
			for(User u : list)
				System.out.println(u.getUserType()+"\t"+u.getUserId()+"\t"+u.getUserName()+"\t"+u.getUserId()+"\t"+u.getUserPassword()+"\t"+u.getUserPhone()+"\t"+u.getUserEmail());
			break;
	
	case 4:
		
			us.updateUser();
			break;
	
			
			
	case 5:
			us.deleteUser();
			break;
		
		
	default:
		
		t = false;
	
	}
	}		
	}
}
