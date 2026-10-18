import java.util.ArrayList;
import java.util.Scanner;


public class WeeklyTemperatures {

	public static void main (String [] args) {
		int i;
		final int NUM_ELEMENTS = 7;
		
		
		Scanner scnr = new Scanner(System.in);
	    ArrayList<String> weekDay = new ArrayList<String>(); 
	    ArrayList<Integer> dayTemp = new ArrayList<Integer>(); 
	    weekDay.add("Monday");
	    weekDay.add("Tuesday");
	    weekDay.add("Wednesday");
	    weekDay.add("Thursday");
	    weekDay.add("Friday");
	    weekDay.add("Saturday");
	    weekDay.add("Sunday");
	    
	    
	    

	    System.out.println("Please enter the average temperature on Monday");
	    for (i = 0; i < NUM_ELEMENTS; ++i) {
	         System.out.print("Number " + (i + 1) + ": ");
	         dayTemp.add(scnr.nextDouble());
	      }
	}
	
}
	










/*
Develop a Java program that will store data in the form of daily average temperatures for one week. 
Store the day and average temperature in two different arraylists. 
Your program should prompt the user for the day of the week (Monday through Sunday) and display both the day and temperature for each day. 
If "week" is entered, the output for your program should provide the temperature for each day and the weekly average. 
Use the looping and decision constructs in combination with the arrays to complete this assignment.

Compile and submit your pseudocode, source code, and screenshots of the application executing the application, the results and GIT repository in a single document.
 */