package com.henrique.defaultmethod;

public class MyInterfaceSimpleImpl implements MyInterface {

	@Override
	public int getNumber() {
		double random = Math.random();
		return (int) random;
	}	
	
}
