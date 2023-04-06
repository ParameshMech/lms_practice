package com.onesoft.lms;

public class UseBike {

	public static void main(String[] args) {
		String[] v1 = args[0].split(",");
		String[] v2 = args[1].split(",");
		
		Bike bike1 = new Bike();
		bike1.brand = v1[0];
		bike1.price = Integer.parseInt(v1[1]);
		bike1.color = v1[2];
		
		Bike bike2 = new Bike();
		bike2.brand = v2[0];
		bike2.price = Integer.parseInt(v2[1]);
		bike2.color = v2[2];
		
		System.out.println("Brand: "+bike1.brand+", Price: "+bike1.price);
		

	}

}

class Bike {
	String brand;
	int price;
	String color;
	
}

