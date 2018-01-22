package com.henrique.nestedinterface;

public class TestClass {
	public static void main(String[] args) {
		A.MyNestedInterface nif = new B();
		
		System.out.printf("Calling A.MyNestedInterface (B implementation): %b\n", nif.execute());
		
		nif = () -> { 
			System.out.println("Executing with lambda!");
			return true;
		};
		
		System.out.printf("Calling A.MyNestedInterface (Lambda implementation): %b\n", nif.execute());
	}
}
