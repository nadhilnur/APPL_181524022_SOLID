package com.appl;

import java.util.Scanner;

import com.appl.Interface.ISecurityUI;

public class ScannerUI implements ISecurityUI {

	@Override
	public String RequestKeyCard() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Slide your key card");
        return s.nextLine();
	}

	@Override
	public int RequestPinCode() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter your pin code: ");
        return s.nextInt();
	}

}
