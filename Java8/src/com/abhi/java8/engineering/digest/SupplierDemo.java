package com.abhi.java8.engineering.digest;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<String> supplier = () -> "Hello World";
		System.out.println(supplier.get());
	}

}
