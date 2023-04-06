package com.onesoft.lms;

public class UseGenerator {
	public static void main(String[] args) {
		Generator g1 = new Generator();
		g1.brand = args[0];
		g1.price = Integer.parseInt(args[1]);
		g1.color = args[2];
		g1.capacity = Integer.parseInt(args[3]);
		g1.taxPer = Integer.parseInt(args[4]);
		g1.isStability = Boolean.parseBoolean(args[5]);
		g1.netPrice = g1.price+(g1.price*g1.taxPer/100);
		
		Generator g2 = new Generator();
		g2.brand = args[6];
		g2.price = Integer.parseInt(args[7]);
		g2.color = args[8];
		g2.capacity = Integer.parseInt(args[9]);
		g2.taxPer = Integer.parseInt(args[10]);
		g2.isStability = Boolean.parseBoolean(args[11]);
		g2.netPrice = g2.price+(g2.price*g2.taxPer/100);
		
		System.out.println("Brand: "+g1.brand+", Price: "+g1.price+", Color: "+g1.color+", Capacity: "+g1.capacity+", Is Stability: "+g1.isStability+", Net Price: "+g1.netPrice);
		System.out.println("Brand: "+g2.brand+", Price: "+g2.price+", Color: "+g2.color+", Capacity: "+g2.capacity+", Is Stability: "+g2.isStability+", Net Price: "+g2.netPrice);
		
	}
}

class Generator {
	String brand;
	int price;
	String color;
	int capacity;
	int taxPer;
	boolean isStability;
	int netPrice;
	
}