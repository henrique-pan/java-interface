package com.henrique.nestedinterface;

public class B implements A.MyNestedInterface {

	@Override
	public boolean execute() {
		System.out.println("EXECUTED!");
		return true;
	}

}
