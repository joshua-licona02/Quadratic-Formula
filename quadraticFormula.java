package cis.vmi.edu;

import java.util.Scanner;

/*
 * Author: Joshua Licona
 * Purpose: Solve for quadratic equation
 */

public class quadraticFormula {

	public static void main(String[]arg) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a: ");
		double vara=scanner.nextDouble();
		
		System.out.println("Enter b: ");
		double varb=scanner.nextDouble();
		
		System.out.println("Enter c: ");
		double varc=scanner.nextDouble();
		
		double discriminant=((Math.pow(varb,2))-4*vara*varc);
		double squareRoot=Math.pow(discriminant, 0.5);
		
		double positiveRoot=((-varb)+squareRoot)/2*vara;
		double negativeRoot=((-varb)-squareRoot)/2*vara;
		
		if(discriminant>0) {
			System.out.println("the equation has two roots"+positiveRoot+"and"+negativeRoot);
		}
		else if(discriminant==0) {
			System.out.println("The equation has one root "+negativeRoot); //could replace negativeRoot with positiveRoot
		}
		else {
			System.out.println("The equation has no real root");
		}
		
		
	}
}
