package com.ae.ae2.random;

public class PasswordMain {

	public static void main(String[] args) {
		
		Password password = new Password();
		
		String p = password.makePassword();
		
		System.out.println(p);
	}

}
