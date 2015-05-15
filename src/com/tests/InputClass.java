package com.tests;

import static java.lang.System.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputClass {

	public static String getInput(String prompt){
		BufferedReader stdin = new BufferedReader(new InputStreamReader(in));
		
		out.print(prompt);
		out.flush();
		
		try{
			return stdin.readLine();
		}catch(IOException e){
			return "Error: " + e.getMessage();
		}
	}
}
