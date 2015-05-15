package com.tests;

import java.io.*;
import static java.lang.System.*;

public class StringManipulator {

	private static String userString; //User text
	private static char [] stringChecker;
	private static String choice;
	
	public static String StringVowels(String sourceString) {// this receives the string read from the file
		
		stringChecker = new char[sourceString.length()]; //Converts String to a char array
		stringChecker = sourceString.toCharArray();
		for (int i = 0; i < stringChecker.length; i++) {
	       new StringManipulator().getVowels(i); //Uses the index of the characters to invert the vowel cases
		}
		String touch = String.valueOf(stringChecker);
		return touch;
	}
	private void getVowels(int i) {
		if(stringChecker[i] == 'a'){
	    	   stringChecker[i] = 'A';
	       }else if(stringChecker[i] == 'A'){
	    	   stringChecker[i] = 'a';
	       }
	       if(stringChecker[i] == 'e'){
	    	   stringChecker[i] = 'E';
	       }else if(stringChecker[i] == 'E'){
	    	   stringChecker[i] = 'e';
	       }
	       if(stringChecker[i] == 'i'){
	    	   stringChecker[i] = 'I';
	       }else if(stringChecker[i] == 'I'){
	    	   stringChecker[i] = 'i';
	       }
	       if(stringChecker[i] == 'o'){
	    	   stringChecker[i] = 'O';
	       }else if(stringChecker[i] == 'O'){
	    	   stringChecker[i] = 'o';
	       }
	       if(stringChecker[i] == 'u'){
	    	   stringChecker[i] = 'U';
	       }else if(stringChecker[i] == 'U'){
	    	   stringChecker[i] = 'u';
	       }
	}
	
	public static void main(String[] args) {
		try{
	    userString = InputClass.getInput("Enter the file path using double backslashes \\\\: ");
	    choice = InputClass.getInput("Enter the file path using double backslashes \\\\: ");
	    
		InputString.outputToWrite(StringVowels(InputString.readFromFile(userString)), choice);
		}catch(IOException ioe){
			out.println("An Error occurred!");
		}
	   }
	 }
	

