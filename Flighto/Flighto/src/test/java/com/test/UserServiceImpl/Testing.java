package com.test.UserServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import com.flighto.bean.User;
import com.flighto.service.UserServiceImpl;

class Testing {

	@Test
	void test() {
		UserServiceImpl us = new UserServiceImpl();
		User u = new User("Student",BigInteger.valueOf(101),"Rakshit Dogra",null,BigInteger.valueOf(896893558),"RakshitDogra101@gmail.com");
		assertEquals(u , us.viewUser());

	}

}
