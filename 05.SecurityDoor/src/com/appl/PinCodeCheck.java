package com.appl;

import com.appl.Interface.ISecurityUI;

public class PinCodeCheck extends SecurityCheck {

	private ISecurityUI securityUI;
	
	public PinCodeCheck(ISecurityUI securityUI) {
		// TODO Auto-generated constructor stub
		this.securityUI = securityUI;
	}

	private boolean IsValid(int pin)
    {
        return true;
    }

	@Override
	public boolean ValidateUser() {
		// TODO Auto-generated method stub
		int pin = securityUI.RequestPinCode();
        if (IsValid(pin))
        {
            return true;
        }
		return false;
	}

}
