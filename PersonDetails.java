package com.onesoft.lms;

public class PersonDetails {
	public static void main(String[] args) {
		String name = args[0];
		char init = args[1].charAt(0);
		int id = Integer.parseInt(args[2]);
		boolean isMale = Boolean.parseBoolean(args[3]);
		
		System.out.println("Name : "+name+"\tInitial : "+init+"\tID : "+id+"\tIs Male : "+isMale);
		
	}

}
