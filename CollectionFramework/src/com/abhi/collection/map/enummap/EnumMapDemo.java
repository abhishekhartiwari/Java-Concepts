package com.abhi.collection.map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {

	public static void main(String[] args) {

		
		EnumMap<Day, String> en = new EnumMap<>(Day.class);
		
		en.put(Day.Monday, "Walk");
		en.put(Day.Tuesday, "Gym");
		en.put(Day.Thursday, "Running");
		
		
		System.out.println("ennn === "+ en);
		
		for (Map.Entry<Day, String> e : en.entrySet()) {
			
			System.out.println(e.getValue() +" "+e.getValue());
		}
	}

}

enum Day{
	
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}