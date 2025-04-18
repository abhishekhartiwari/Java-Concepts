package com.abhi.supplier;

import java.util.function.Supplier;

public class SupplierDemo {

	
    public static void main(String[] args) {
        
        Supplier<String> supplier = () -> "Hello, Supplier!";
        System.out.println(supplier.get());
    }
}
