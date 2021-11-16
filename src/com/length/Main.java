package com.length;

import java.util.Scanner;
	
public class Main {
	
	double x1, x2, x3, x4;
	double y1, y2, y3, y4;
	double length;
	
	public double equals() {
		
		double length2 = Math.sqrt( Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
		
		if (length == length2) {
			System.out.println(" The two lines are equal ");
		}
		else {
			System.out.println(" The two lines are not equal");
		}
		
		return length2;
	}
	
	public void compareTo (double length, double length2) {
		
		if (length == length2) {
			System.out.println("\n The two lines are equal in length");
		}
		
		else if (length > length2) {
			System.out.println("\n The first line is greater than the second. ");
		}
		
		else {
			System.out.println("\n The second line is greater than the first. ");
		}
	}
	
	public void calculateLength() {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		
		System.out.print(" Enter x1: ");
		x1 = read.nextDouble();
		
		System.out.print(" Enter y1: ");
		y1 = read.nextDouble();
		
		System.out.print(" Enter x2: ");
		x2 = read.nextDouble();
		
		System.out.print(" Enter y2: ");
		y2 = read.nextDouble();
		
		System.out.print(" Enter x3: ");
		x3 = read.nextDouble();
		
		System.out.print(" Enter y3: ");
		y3 = read.nextDouble();
		
		System.out.print(" Enter x4: ");
		x4 = read.nextDouble();
		
		System.out.print(" Enter y4: ");
		y4 = read.nextDouble();
		
		length = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("\n The first point is : (" + x1 + ", " + y1 + ")");
		System.out.println(" The second point is : (" + x2 + ", " + y2 + ")");		
		
		System.out.println(" The third point is : (" + x3 + ", " + y3 + ")");
		System.out.println(" The fourth point is : (" + x4 + ", " + y4 + ")\n");
		
		
		
		
		double length2 = equals();
		System.out.println(" The length of the first line is : " + length);
		System.out.println(" The length of the second line is: " + length2);
		
		compareTo(length, length2);		
		
	}

}