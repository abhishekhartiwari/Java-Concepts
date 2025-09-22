package com.abhi.creational;

public class SingeltonDesignEager {
	
	//This approach creates the singleton instance at the time of class loading, making it thread-safe by default.
	private static SingeltonDesignEager instance = new SingeltonDesignEager(); //Eager
	
	private SingeltonDesignEager() {}
	
	public static SingeltonDesignEager getObject() {
		return instance;
	}

}
