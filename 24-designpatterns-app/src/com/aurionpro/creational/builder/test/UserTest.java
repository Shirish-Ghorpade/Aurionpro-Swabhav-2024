package com.aurionpro.creational.builder.test;

import com.aurionpro.creational.builder.model.User;
import com.aurionpro.creational.builder.model.User.UserBuilder;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User.UserBuilder()
							.setEmailId("Shirish@gmail.com")
							.setUserId("UserId123")
							.setUserName("Shirish")
							.build();
		
		
//		for Static method do not need to use new keyword 
		
		User user2 = User.UserBuilder.builder().setEmailId("Shirish@gmail.com").setUserName("Shirish").build();
		System.out.println(user2);
		System.out.println(user);

	}

}
