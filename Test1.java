package com.onesoft.lms;

public class Test1 {
	public static void main(String[] args) {
		String[] words = args[0].split(",");
		
		
		System.out.println(words[3].toUpperCase());
		System.out.println("Last letter of Welcome is "+words[0].charAt(words[0].length()-1));
		System.out.println("Length of \"to\" is "+words[1].length());
		System.out.println(words[3].substring(1,4));
		System.out.println("Array Length is "+words.length);
	}

}
