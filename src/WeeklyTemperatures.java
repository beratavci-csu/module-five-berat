import java.util.ArrayList;
import java.util.Scanner;


public class WeeklyTemperatures {

	public static void main (String [] args) {

		Scanner scnr = new Scanner(System.in);
		boolean isRunning = true;
		int i;
		double weekAverage = 0;
		String dayInput = "";
		
	    ArrayList<String> weekDay = new ArrayList<String>(); 
	    ArrayList<Double> dayTemp = new ArrayList<Double>();
	    
	    weekDay.add("Monday");
	    weekDay.add("Tuesday");
	    weekDay.add("Wednesday");
	    weekDay.add("Thursday");
	    weekDay.add("Friday");
	    weekDay.add("Saturday");
	    weekDay.add("Sunday");
	    
	    dayTemp.add(60.0);
	    dayTemp.add(63.5);
	    dayTemp.add(64.5);
	    dayTemp.add(70.5);
	    dayTemp.add(58.5);
	    dayTemp.add(66.0);
	    dayTemp.add(50.5);
	    

	    
	    while((true)) {
	    	weekAverage = 0;
	    	
	    	System.out.println("");
		    System.out.println("Please type which day of the week (Monday through Sunday) for the average temperature.");
		    System.out.println("Type 'Week' to see the average temperature for the entire week.");
		    System.out.println("Type 'exit' to exit.");
	    	System.out.print("Type here: ");
	    	dayInput = scnr.next();
	    	dayInput = dayInput.substring(0, 1).toUpperCase() + dayInput.substring(1); 
	    	
	    	System.out.println("");
	    	
	    	
	        if (dayInput.equals("Exit")) {
	        	System.out.println("Exiting...");
	        	break;
	        } 
	        

	        else if (dayInput.equals("Week")) {
	        	 for (i = 0; i < weekDay.size(); ++i) {
	        		 System.out.println(weekDay.get(i) + " : " + dayTemp.get(i) + "°F");
	        		 weekAverage += dayTemp.get(i);
	        	 }
        		 System.out.println("This week's average temperature: " + String.format("%.2f", weekAverage/7) + "°F"); 
	        }
	        
	        
	        else if (weekDay.contains(dayInput)) {
	        	 for (i = 0; i < weekDay.size(); ++i) {
		    	    if (weekDay.get(i).equalsIgnoreCase(dayInput)) {
		    	    		System.out.println(weekDay.get(i) + " : " + dayTemp.get(i)+ "°F");
		    	    }
	        	 }
	        }	        
	        
	        
	        else {
		    	System.out.println("Invalid Input!");
		    	System.out.println("Exiting....");
		    	break;
	        }
	    	
	    }
	    System.exit(0);
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