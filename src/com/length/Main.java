package com.length;

public class Main {

	public static void main(String[] args) {
		System.out.println(" in the main class");
		
		double neg = Math.floor(Math.random() * 2);		
		double x1 = Math.floor(Math.random() * 10);
		
		if (neg == 1) {
			x1 *= -1;
		}
		
		neg = Math.floor(Math.random() * 2);
		double y1 = Math.floor(Math.random() * 10);
		if (neg == 1) {
			y1 *= -1;
		}
		
		neg = Math.floor(Math.random() * 2);
		double x2 = Math.floor(Math.random() * 10);
		if (neg == 1) {
			x2 *= -1;
		}
		
		neg = Math.floor(Math.random() * 2);
		double y2 = Math.floor(Math.random() * 10);
		if (neg == 1) {
			y2 *= -1;
		}
		
		double length = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println(" The first point is : (" + x1 + ", " + y1 + ")");
		System.out.println(" The first point is : (" + x2 + ", " + y2 + ")");
		System.out.println(" The length of the line is : " + length);
	}

}