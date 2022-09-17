/**
* Developer - Logan Laine Class - CMIS 141/6382 Date 14SEP2022	Instructor - Professor Rowson
* Program 
*/

import java.util.Scanner; 
public class Asg5 {
	
	public static void displayMenu() {
		System.out.println("   MENU");
		System.out.println("1. Convert cubic feet to U.S. bushels");
		System.out.println("2. Convert miles to kilometers");
		System.out.println("3. Determine graduation with honors title");
		System.out.println("4. Exit");
		System.out.println();
		
	}
	
	public static void processChoice(int c) {
		
		switch (c) {
		
		case 1: 
			cubicFeetToBushels();
			break;
			
		case 2:
			milesToKilometers();
			break;
			
		case 3: 
			graduationWithHonorsTitle();
			break;
			
		case 4: break;
			
		default:
			System.out.print("Invalid choice.");
			
		}
		System.out.println();
		
	}
	
	public static double convertCubicFeetToBushels(float cubicFeet)  {
		double BU = 0.803564;
		double usBushels;
		
		usBushels = cubicFeet * BU;
		return usBushels;
		
	}
	
	public static void cubicFeetToBushels() {
		int cubicFeet = 0;
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter cubic feet: ");
		cubicFeet = stdin.nextInt();
		double usBushels = convertCubicFeetToBushels(cubicFeet);

		System.out.println();
		System.out.println(cubicFeet + " cubic ft. = " + usBushels + " U.S. bushels");
		
		stdin.close();
		
	}
	
	public static double convertMilesToKilometers(double miles)  {
		double KM = 1.60934;
		double kilometers;
		
		kilometers = miles * KM;
		return kilometers;
		
	}
	
	public static void milesToKilometers() {
		int miles = 0;
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter miles: ");
		miles = stdin.nextInt();
		double kilometers = convertMilesToKilometers(miles);
		
		System.out.println();
		System.out.print(miles + " miles = " + kilometers + " km");
		
		stdin.close();
		
	}
	
	public static void graduationWithHonorsTitle() {
		double gpa = 0;
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter GPA: ");
		gpa = stdin.nextDouble();
		
		if (gpa >= 3.5 && gpa <= 3.7) {
			System.out.print("Congratulations, you have graduated Cum Laude!");
			
		}
		else if (gpa >= 3.8 && gpa <= 3.9) {
			System.out.print("Congratulations, you have graduated Magna Cum Laude!");
			
		}
		else if (gpa == 4.0){
			System.out.print("Congratulations, you have graduated Summa Cum Laude!");
			
		}
		else {
			System.out.print("You did not graduate with honors.");
			
		}
		
		stdin.close();
		
	}

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		int selection = 0;
		
		do {
			
			displayMenu();
			//I am trying to clear the buffer with the line below but my buffer doenst seem to clear...
			//stdin.nextLine();
			System.out.print("Enter your selection: ");
			selection = stdin.nextInt();
			
			processChoice(selection);
			System.out.println();
			
		} while (selection != 4);
		
		stdin.close();
	}
	
}





