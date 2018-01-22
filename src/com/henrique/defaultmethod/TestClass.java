package com.henrique.defaultmethod;

public class TestClass {

	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceSimpleImpl();
		
		System.out.println("MyInterfaceSimpleImpl.getNumber(): " + myInterface.getNumber());
		System.out.println("MyInterfaceSimpleImpl.getString(): " + myInterface.getString());
		
		myInterface = new MyInterfaceFullImpl();
		
		System.out.println("MyInterfaceSimpleImpl.getNumber(): " + myInterface.getNumber());
		System.out.println("MyInterfaceSimpleImpl.getString(): " + myInterface.getString());
	}
	
}
