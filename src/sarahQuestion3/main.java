package sarahQuestion3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String args[]){
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int attempts=0;
		
		for(int a=0;a<5;a++){
			System.out.println("I hate you!");
			int num = rand.nextInt(5);
			System.out.print("Enter number: ");
			int store = input.nextInt();
			if(num==store)
				System.out.println("Congratulation!");
			else if(store<num)
				System.out.println("Please guess a larger number");
			else 
				System.out.println("Please guess a smaller number");
			
			attempts++;
		}
		System.out.println("What is your name?");
		String username = input.nextLine();
		
		//Reference: http://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-a-file-in-java
		try{
		    PrintWriter writer = new PrintWriter("GuessReport.txt", "UTF-8");
		    writer.println(username);
		    writer.println(attempts);
		    writer.close();
		} catch (IOException e) {
		   // do something
		}
		
	}
}
