package com.practice;

import java.util.Scanner;
import static java.lang.System.out;

public class FibSeries {
	
	static Scanner scn;
	
	public static void userInput() {
		
		scn = new Scanner(System.in);
		
		out.println("Enter an index for a Fibonacci number: ");
		
		int index = scn.nextInt();
		
		out.println("The Fibonacci number at index " + index + " is " + fib(index));
	}
	
	public static long fib(long index){
		
		if(index == 0){
			
			return 0;
			
		}else if(index == 1){
			
			return 1;
			
		}else{
			
			return fib(index - 1) + fib(index - 2);
		}
	}
	
	public static void main(String... args){
		
		userInput();
	}
}
