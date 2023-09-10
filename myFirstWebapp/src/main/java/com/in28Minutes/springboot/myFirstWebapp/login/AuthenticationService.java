package com.in28Minutes.springboot.myFirstWebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
   public boolean authenticate(String name ,String password) {
	   boolean isValidName = name.equals("Rishabh");
	   boolean isValidPassword = password.equals("Rishu6159@");

	   
	   return isValidName && isValidPassword;
   }
}
