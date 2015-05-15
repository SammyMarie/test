/**
 * 
 */
package com.tests;

import java.io.*;
import java.nio.file.*;
import static java.lang.System.*;

/**
 * @author smlif_000
 *
 */
public class InputString {
	
	public static void outputToWrite(String textToReceieve, String outputPath){//receives modified text and writes it to an output file
		
		try{
					FileWriter userInput = new FileWriter(outputPath, true);
					userInput.write(textToReceieve + " ");
					userInput.close();
					//out.println("Success!");
				}catch(IOException ioe){
					out.println("An error occurred");
				}
	}
	
	public static String readFromFile(String textToRead) throws IOException{// reads from a file by user specifying the file path

		
			String text = new String(Files.readAllBytes(Paths.get(textToRead)));
		
		return text;
	}
}
