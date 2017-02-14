package sarah;

import java.util.Scanner;

public class main {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		//Square
		Square sObject = new Square();
		
		System.out.print("Enter Square side length:");
		int sLength = input.nextInt();
		
		System.out.println("Area of Squre: "+sObject.Area(sLength,sLength));
		System.out.println("Perimeter of Squre: "+sObject.Perimeter(sLength,sLength));
		
		
		//Rectanle
		Rectangle rObject = new Rectangle();
		
		System.out.println("Enter Rectangle length:");
		int rLength = input.nextInt();

		System.out.println("Enter Rectangle width:");
		int rwidth= input.nextInt();
		
		System.out.println("Area of Squre: "+rObject.Area(rLength,rwidth));
		System.out.println("Perimeter of Squre: "+rObject.Perimeter(rLength,rwidth));
		
	}

}
