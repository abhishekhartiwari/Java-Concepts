package com.abhi.creational;

public class SingeltonDesignLazy {
	
	private static SingeltonDesignLazy instance;
	private SingeltonDesignLazy() {}
	
	
	public static SingeltonDesignLazy getObject() {
		
		if(instance == null) {
			
			instance = new SingeltonDesignLazy(); //lazy
		}
		return instance;
	}

}
