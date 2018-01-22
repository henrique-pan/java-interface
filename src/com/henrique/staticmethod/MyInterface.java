package com.henrique.staticmethod;

public interface MyInterface {

	int getNumber();
	
	// Java 8
	default String getString() {
		return "Default Implementation";
	}
	
	// Java 8
	// InterfaceName.staticMethodName
	static int getDefaultNumber() {
		return 0;
	}
	
}
