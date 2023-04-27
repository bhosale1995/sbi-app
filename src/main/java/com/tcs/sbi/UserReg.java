package com.tcs.sbi;

import in.practice.security.PwdSecurityService;

public class UserReg {
	public static void main(String[] args) {
		
		PwdSecurityService pass = new PwdSecurityService();
		String encode  = pass.encode("Akshay");
		System.out.println(encode);

	}

}
