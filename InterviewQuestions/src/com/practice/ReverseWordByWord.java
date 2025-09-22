package com.practice;

import javax.naming.spi.DirStateFactory.Result;

public class ReverseWordByWord {
	
	public static void main(String[] args) {

        String str = "sky is blue";
        String[] words = str.split(" ");  // split by space
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString(); //reverseStringMethod(word);
            result.append(reversedWord).append(" ");
        }
        System.out.println(result);
	}
	public static String reverseStringMethod(String str) {
		String reverseString ="";
		for(int i=str.length()-1;i>=0;i--) {
			reverseString = reverseString+str.charAt(i);
		}

	return reverseString;
	}

}
