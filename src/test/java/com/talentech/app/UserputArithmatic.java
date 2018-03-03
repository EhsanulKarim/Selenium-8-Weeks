package com.talentech.app;

import java.util.Scanner;

public class UserputArithmatic {

	public static void main(String[] args) {
		
		int x;
		int y;
		int sum;
		int sub;
		
		
		//asking user to enter number and then read the number
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		x = s.nextInt();
		
		System.out.print("Enter your second number: ");
		y = s.nextInt();
		
		if (x>y) {
			sub = x-y;
			System.out.println("The Sub is:" +sub);
		}//end if
		else {
			sum = x+y;
			System.out.println("The Sum is: "+sum);
		}//end else
		
		
		}
			
		

}
