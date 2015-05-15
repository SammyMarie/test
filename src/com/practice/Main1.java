package com.practice;

import java.io.*;

import static java.lang.System.out;

public class Main1 {


	public static void numbers(BufferedReader in) throws IOException {

		String s;

		int sum = 0;

		while ((s = in.readLine()) != null) {

			int number = Integer.parseInt(s);

			for(int i = number; i > 0; i--){


				if(i % 5 == 0 || i % 7 == 0){

					continue;	
				}

				sum += i;
			}

			s = String.valueOf(sum);

			out.println("Sum is " + s);
		}
	}
	public static void main(String[] args) {

		try{

			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			numbers(in);

		}catch(IOException ioe){

			ioe.printStackTrace();
		}
	}
}