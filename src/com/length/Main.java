package com.length;

import java.util.Scanner;

public class Main {
	
	public void equals(double x3, double y3, double x4, double y4, double length) {
		double length2 = Math.sqrt( Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
		
		if (length == length2) {
			System.out.println(" The two lines are equal ");
		}
		else {
			System.out.println(" The two lines are not equal");
			System.out.println(" Second line length: " + length2);
		}
	}

	public static void main(String[] args) {
		
		
		Main obj = new Main();
		Scanner read = new Scanner(System.in);
		
		System.out.print(" Enter x1: ");
		double x1 = read.nextDouble();
		
		System.out.print(" Enter y1: ");
		double y1 = read.nextDouble();
		
		System.out.print(" Enter x2: ");
		double x2 = read.nextDouble();
		
		System.out.print(" Enter y2: ");
		double y2 = read.nextDouble();
		
		System.out.print(" Enter x3: ");
		double x3 = read.nextDouble();
		
		System.out.print(" Enter y3: ");
		double y3 = read.nextDouble();
		
		System.out.print(" Enter x4: ");
		double x4 = read.nextDouble();
		
		System.out.print(" Enter y4: ");
		double y4 = read.nextDouble();
		
		double length = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println(" The first point is : (" + x1 + ", " + y1 + ")");
		System.out.println(" The second point is : (" + x2 + ", " + y2 + ")");
		
		System.out.println(" The length of the line is : " + length);
		
		System.out.println(" The third point is : (" + x3 + ", " + y3 + ")");
		System.out.println(" The fourth point is : (" + x4 + ", " + y4 + ")");
		
		
		obj.equals(x3, y3, x4, y4, length);
		
	}

}