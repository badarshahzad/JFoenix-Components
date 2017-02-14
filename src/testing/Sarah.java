package testing;

import java.util.Random;
import java.util.Scanner;

/*
 * AUTHOR: Badar Sudo
 * Description For: Hidden Sarah... I done it 80% you have to think how 
 * you will add -ve values randomly in array  
 * */

public class Sarah {

	public static void main(String args[]){
		int array[] = new int[50];
		
		/*
		 * This is Random fucntion who generate random number
		 * to then in loop i am  assign this to array of ten. 
		 * */
		Random rand = new Random();
		int num=0;
		for(int a=0;a<50;a++){
			num = rand.nextInt(10);
			array[a]=num;
		}
		/*Here I am counting the array elements and there indexes how
		 * many times it come into it's own place 
		 * */
		int count[] = new int[10];
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				if(array[a]==b){
					count[b]++;
				}
			}
			
		}
		System.out.println("N"+"\t\t"+"Count");
		for(int a=0;a<10;a++){
			System.out.println(+array[a]+"    \t"+a+"      \t"+count[a]);
			
		}

		
		
	}
}
