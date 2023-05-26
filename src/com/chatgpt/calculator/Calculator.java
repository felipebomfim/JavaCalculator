package com.chatgpt.calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Welcom to the Calculator!");
		System.out.println("Insert two whole numbers and the operation.\n");
		
		System.out.println("First number:");
		double num1 = reader.nextFloat();
		
		System.out.println("Second number:");
		double num2 = reader.nextFloat();
		System.out.println("Select an operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Enter your choice: ");
		
		int choice = reader.nextInt();
		
		double result = 0;
		
		switch(choice){
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:
				result = (double) num1/num2;
				break;
		}
		
		System.out.printf("The result is: %.2f\n", result);
		reader.close();
	}

}
