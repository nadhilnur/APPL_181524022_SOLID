package com.appl;

import java.util.Scanner;

public class SecurityManager {

	private KeyCardCheck keyCardCheck;
	private PinCodeCheck pinCodeCheck;
	
	public SecurityManager(KeyCardCheck keyCardCheck, PinCodeCheck pinCodeCheck) {
		// TODO Auto-generated constructor stub
		this.keyCardCheck = keyCardCheck;
		this.pinCodeCheck = pinCodeCheck;
	}

	public void Check() {
		Scanner s = new Scanner(System.in);
        System.out.println("Choose option: 1 - KeyCard, 2 - PinCode:");
        int option = s.nextInt();
        switch (option)
        {
            case 1:
            	System.out.println(this.keyCardCheck.ValidateUser());
                break;
            case 2:
            	System.out.println(this.pinCodeCheck.ValidateUser());
                break;
        }
    }
}
