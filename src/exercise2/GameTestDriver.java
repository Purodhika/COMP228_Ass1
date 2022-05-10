package exercise2;

import java.util.Scanner;

public class GameTestDriver 
{
	public static void main(String[] args)
	 {
		//to display console output 
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter name of the game tester: ");
		String name = s1.nextLine();
		
		//user selects the type of job
		System.out.println("Please select the type of gamer Full Time or Part Time");
		String typeofjob = s1.nextLine();
		
		switch (typeofjob)
		{
		//called if the user selects full-time
		case "Full Time":
			
			FullTimeGameTester ft1 = new FullTimeGameTester();
			
			//displays the base salary of a full-time game tester
			System.out.printf("%s%d" , "Salary of Part time game tester " +name + " is ", ft1.getSalary());

			break;
			
		//called of the user selects part-time type	
		case "Part Time":
			
			PartTimeGameTester pt1 = new PartTimeGameTester();
			
			//collects hours worked in part-time type
			System.out.println("Enter the number of hours played");
			int hours = s1.nextInt();
			
			//number of hours passed to setHours method
			pt1.setHours(hours);
			
			//calculates and displays the salary based on number of hours worked
			System.out.printf("%s%d" , "Salary of Part time game tester " +name + " is ", pt1.getSalary());

			break;
			
			default:
				
				System.out.println("Invalid input");	
		  }
	   }
	}
		

	


