/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice;

/**
 *
 * @author smlif_000
 */
import static java.lang.System.*;

import java.util.Scanner;

public class Strings {

	static String[] userInput;
	static int index;
	static String s;
	static Scanner in;



	public static void receiveInput() {

		userInput = new String[5];

		in = new Scanner(System.in);

		out.println("Enter array elements: ");

		for (int i = 0; i < 5; i++) {

			userInput[i] = in.nextLine();
		}

		arrayChecks();
	}

	private static void arrayChecks() {

		out.println("Array elements are: ");

		for (index = 0; index < userInput.length; index++) {

			out.print("Index value is " + index + ": ");

			out.println(userInput[index]);
			
		}
	}

	public static void main(String[] args) {

		receiveInput();

	}
}

