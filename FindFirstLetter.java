package com.onesoft.lms;

public class FindFirstLetter {
	public static void main(String[] args) {
		String[] words = args[0].split(",");
		char a = words[0].charAt(0);
		char b = words[1].charAt(0);
		
		System.out.println(a+"\n"+b);
	}

}
