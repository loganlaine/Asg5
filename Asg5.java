/**
* Developer - Logan Laine Class - CMIS 141/6382 Date 18SEP2022	Instructor - Professor Rowson
* Program Prompt the user for an input to convert a variable into another from one of the desired 
* menu options. 
*/

import java.util.Scanner; 
public class Asg5 {
	
	//menu method - displays options for the if else statement in main.
	public static void displayMenu() {
		System.out.println("   MENU"); //tab added to format console display.
		System.out.println("1: Convert cubic feet to U.S. bushels");
		System.out.println("2: Convert miles to kilometers");
		System.out.println("3: Determine graduation with honors title");
		System.out.println("4: Exit"); //4 allows user to exit using the while loop.
		System.out.println(); //added for readability.
		
	}
	//conversion call from main. does math and returns desired conversion to main.
	public static double convertCubicFeetToBushels(float cubicFeet)  {
		double BU = 0.803564; //BU = bushels
		double usBushels;
		
		usBushels = cubicFeet * BU;
		return usBushels;
		
	}
	//conversion call from main. does math and returns desired conversion to main.
	public static double convertMilesToKilometers(float miles)  {
		double KM = 1.60934;
		double kilometers;
		
		kilometers = (miles * KM);
		return kilometers;
		
	}
	public static String graduationWithHonorsTitle(double gpa) {
		String honorsTitle;
		
		if (gpa >= 3.5 && gpa <= 3.7) {
			honorsTitle = "	Congratulations, you have graduated Cum Laude!";
			
		}
		else if (gpa >= 3.8 && gpa <= 3.9) {
			honorsTitle = "	Congratulations, you have graduated Magna Cum Laude!";
			
		}
		else if (gpa == 4.0){
			honorsTitle = "	Congratulations, you have graduated Summa Cum Laude!";
			
		}
		else {
			honorsTitle = "	You did not graduate with honors.";
			
		}
		
		return honorsTitle;
		
	}
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		int selection = 0;
		float cubicFeet = 0;
		float miles = 0;
		double gpa = 0.0;
		
		do {
			displayMenu();
			
			System.out.print("Enter your selection: ");
			selection = stdin.nextInt();
			System.out.println();
			
			if (selection == 1) {
				
				System.out.print("	Enter cubic feet: ");
				cubicFeet = stdin.nextInt();
				float usBushels = (float) convertCubicFeetToBushels(cubicFeet); //calls conversion method and returns bushels.
				
				
				System.out.println("	" + cubicFeet + " cubic ft. = " + usBushels + " U.S. bushels");
				System.out.println(""); //added for readability.
				
			}
			if (selection == 2) {
								
				System.out.print("	Enter miles: ");
				miles = stdin.nextInt();
				float kilometers = (float) convertMilesToKilometers(miles); //calls conversion method and returns kilometers.
				
				
				System.out.println("	" + miles + " mile(s) = " + kilometers + " km");
				System.out.println(""); //added for readability.
				
			}
			
			// standard if-else statement used to return honors status.
			if (selection == 3) {
				System.out.print("	Enter GPA: ");
				gpa = stdin.nextDouble();
				String honorsTitle = graduationWithHonorsTitle(gpa);
				
				System.out.println(honorsTitle);
				System.out.println(""); //added for readability.

			}
			
		} while (selection != 4); //If selection is 4 the program will end.
		
		stdin.close();
	}
	
}





