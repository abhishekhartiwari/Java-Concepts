package com.abhi.java8.other;



interface Phone {
	void call();
	default void message() {
		System.out.println("Messaging");
	}
	static void alarm() {
		System.out.println("Set Alarm");
	}
}

class AndroidPhone implements Phone{
	public void call() {
		System.out.println("Calling");
	}
}


public class DemoJava8Interface {
	public static void main(String []args) {
		Phone p = new AndroidPhone();
		p.call();
		p.message();
		Phone.alarm();
	}

}
