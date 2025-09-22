package com.abhi.behaviourl;


class Car {
 private String engine;
 private String color;
 private int wheels;

 private Car(Builder builder) {
     this.engine = builder.engine;
     this.color = builder.color;
     this.wheels = builder.wheels;
 }

 public static class Builder {
     private String engine;
     private String color;
     private int wheels;

     public Builder withEngine(String engine) {
         this.engine = engine;
         return this;
     }

     public Builder withColor(String color) {
         this.color = color;
         return this;
     }

     public Builder withWheels(int wheels) {
         this.wheels = wheels;
         return this;
     }

     public Car build() {
         return new Car(this);
     }
 }

 @Override
 public String toString() {
     return "Car [engine=" + engine + ", color=" + color + ", wheels=" + wheels + "]";
 }

 public static void main(String[] args) {
     // Using the builder to create a car object
     Car myCar = new Car.Builder()
         .withEngine("V8")
         .withColor("Red")
         .withWheels(4)
         .build();

     System.out.println(myCar);

     // We can create another car with a different configuration
     Car anotherCar = new Car.Builder()
         .withEngine("Electric")
         .withColor("Blue")
         .build(); // Wheels will be null since it's not set

     System.out.println(anotherCar);
 }
}
