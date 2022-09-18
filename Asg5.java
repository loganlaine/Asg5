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
	
	public static double convertCubicFeetToBushels(double cubicFeet)  {
		double BU = 0.803564;
		double usBushels;
		
		usBushels = cubicFeet * BU;
		return usBushels;
		
	}
	
	public static double convertMilesToKilometers(float miles)  {
		double KM = 1.60934;
		double kilometers;
		
		kilometers = (miles * KM);
		return kilometers;
		
	}

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		int selection = 0;
		float cubicFeet = 0;
		float miles = 0;
		
		do {
			displayMenu();
			
			System.out.print("Enter your selection: ");
			selection = stdin.nextInt();
			System.out.println();
			
			if (selection == 1) {
				
				System.out.print("	Enter cubic feet: ");
				cubicFeet = stdin.nextInt();
				float usBushels = (float) convertCubicFeetToBushels(cubicFeet);
				
				
				System.out.println("	" + cubicFeet + " cubic ft. = " + usBushels + " U.S. bushels");
				System.out.println("");
				
			}
			if (selection == 2) {
								
				System.out.print("	Enter miles: ");
				miles = stdin.nextInt();
				float kilometers = (float) convertMilesToKilometers(miles);
				
				
				System.out.println("	" + miles + " mile(s) = " + kilometers + " km");
				System.out.println("");
				
			}
			if (selection == 3) {
				double gpa = 0.0;
				System.out.print("	Enter GPA: ");
				gpa = stdin.nextDouble();
				
				if (gpa >= 3.5 && gpa <= 3.7) {
					System.out.println("	Congratulations, you have graduated Cum Laude!");
					System.out.println("");
					
				}
				else if (gpa >= 3.8 && gpa <= 3.9) {
					System.out.println("	Congratulations, you have graduated Magna Cum Laude!");
					System.out.println("");
					
				}
				else if (gpa == 4.0){
					System.out.println("	Congratulations, you have graduated Summa Cum Laude!");
					System.out.println("");
					
				}
				else {
					System.out.println("	You did not graduate with honors.");
					System.out.println("");
					
				}
				
			}
			
		} while (selection != 4);
		
		stdin.close();
	}
	
}
