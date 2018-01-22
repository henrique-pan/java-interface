package com.henrique.defaultmethod;

public interface MyInterface {

	int getNumber();
	
	//Java 8
	default String getString() {
		return "Default String";
	}
	
}
