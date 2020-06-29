package com.appl;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScannerUI scannerUi = new ScannerUI();
        KeyCardCheck keyCardCheck = new KeyCardCheck(scannerUi);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(scannerUi);
        SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
        manager.Check();
	}

}
