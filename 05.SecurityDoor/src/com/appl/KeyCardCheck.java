package com.appl;

import com.appl.Interface.ISecurityUI;

public class KeyCardCheck extends SecurityCheck {

	private ISecurityUI securityUI;
	
	public KeyCardCheck(ISecurityUI securityUI) {
		// TODO Auto-generated constructor stub
		this.securityUI = securityUI;
	}
	
	private boolean IsValid(String code) {
		return true;
	}

	@Override
	public boolean ValidateUser() {
		// TODO Auto-generated method stub
		String code = securityUI.RequestKeyCard();
		if(IsValid(code)) {
			return true;
		}
		return false;
	}

}
