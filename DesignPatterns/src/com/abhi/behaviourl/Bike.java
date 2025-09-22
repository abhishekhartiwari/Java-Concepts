package com.abhi.behaviourl;

class Bike {
	private String horn;
	private String color;
	private int wheels;

	public Bike(Builder builder) {
		this.horn= builder.horn;
		this.color=builder.color;
		this.wheels=builder.wheels;

	}
	
	public static class Builder {

		private String horn;
		private String color;
		private int wheels;
		
		
		public Builder withHorn(String horn) {
			this.horn=horn;
			return this;
		}
		public Builder withColor(String color) {
			this.color=color;
			return this;
		}
		public Builder withWheels(int wheels) {
			this.wheels=wheels;
			return this;
		}
		
		public Bike build() {
			return new Bike(this);
		}
		
		
	}
	@Override
	public String toString() {
		return "Bike [horn=" + horn + ", color=" + color + ", wheels=" + wheels + "]";
	}

	
	public static void main(String[] args) {
		Bike b = new Bike.Builder().withColor("RED").withHorn("NO").withWheels(4).build();
		System.out.println(b);
	}
}
