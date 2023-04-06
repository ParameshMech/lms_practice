package com.onesoft.lms;

public class AverageProg {
	public static void main(String[] args) {
		int a1 = Integer.parseInt(args[0]);
		int a2 = Integer.parseInt(args[1]);
		int a3 = Integer.parseInt(args[2]);
		int a4 = Integer.parseInt(args[3]);
		int a5 = Integer.parseInt(args[4]);
		
		int intAvg = (a1+a2+a3+a4+a5)/5;
		System.out.println("Int_Average is "+'"'+intAvg+'"');
		
		float b1 = Float.parseFloat(args[0]);
		float b2 = Float.parseFloat(args[1]);
		float b3 = Float.parseFloat(args[2]);
		float b4 = Float.parseFloat(args[3]);
		float b5 = Float.parseFloat(args[4]);
		
		float floatAvg = (b1+b2+b3+b4+b5)/5;
		System.out.println("Float_Average is "+'"'+floatAvg+'"');
		
		
	}

}
