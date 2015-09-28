// Using java, have the function capitalize(str) take the str parameter being passed and capitalize
// the first letter of each word. Words will be separated by only one space.
// the scanner object should be in the main method, from where we are going to call our function for testing
// it should take string input from a user


package Caps;

import java.util.Scanner;
import java.util.Arrays;

public class Capitalize {
	
	
	public static void main(String[] args) {
				
			 System.out.println("Input Sentence:");
			 
				Scanner input = new Scanner(System.in);
			 
				String caps= input.nextLine();
				
				 // Print the method Capitalizes which parses the parameter caps which is the user input
				System.out.println(capitalizes(caps));
			
		}
	
	
	 // Function/method that capitalizes that takes a string parameter caps.
	 public static String capitalizes (String caps) {
		 String str= caps.toLowerCase();
	        if (str.length() == 0) return str;
	        
	     // Convert String to array.
	        
	        String[] words = str.split(" ");
	        // StringBuilder with 16 empty elements
	        StringBuilder sb = new StringBuilder();
	    	 
	        // looping through an array
	            for (int i = 0; i < words.length; i++) {
	      
	                sb.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" "); 
	            }
	            // Convert sb to string and remove spaces before and after 
	        return  sb.toString().trim();
	    	
	    }
	
	
	
	

	}

