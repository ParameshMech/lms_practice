package com.onesoft.lms;

public class UseAirconditioner {
	public static void main(String[] args) {
		Airconditioner ac = new Airconditioner();
		ac.brand = args[0];
		ac.price = Integer.parseInt(args[1]);
		ac.color = args[2];
		ac.capacity = Float.parseFloat(args[3]);
		ac.discountPer = Integer.parseInt(args[4]);
		ac.netPrice = ac.price-(ac.price*ac.discountPer/100);
	
		System.out.println("Net Price: "+ac.netPrice+", Brand: "+ac.brand+", Color: "+ac.color);
		
	}

}

class Airconditioner {
	String brand;
	int price;
	String color;
	float capacity;
	int discountPer;
	float netPrice;
}
