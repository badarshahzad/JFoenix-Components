package sarahQuestion3;

import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class Done {
	public static void main(String[] args) throws FileNotFoundException {

		// opening the text file

		// File f= null;
		try {
			FileWriter fw = new FileWriter("Helwan.txt", true);
			PrintWriter f = new PrintWriter(fw);

			int num;
			Random rand = new Random();
			for (int i = 1; i <= 100; i++) {
				num = rand.nextInt();
				f.println(num);
			} // End for loop
			f.flush();
			f.close();
		} // End Try Block

		catch (IOException e) {
			System.out.println("the file doen't Exist. ");
		}

		// finally {f.close();}

		// to read back from the text file

		File f = new File("Helwan.txt");
		Scanner s = new Scanner(f);
		int counter = 0;
		for (int j = 0; j < 100; j++) {
			int n = s.nextInt();
			if (n % 2 == 0)
				counter++;
		} // end for loop
		double perc = (counter / 100) * 100;
		System.out.println(perc);
		System.out.println(48/100);

		// to store in binary file

		FileOutputStream fs = new FileOutputStream("Report.dat", true);
		DataOutputStream dOut = new DataOutputStream(fs);
		try {
			//System.out.println(perc);
			dOut.writeDouble(perc);
			dOut.flush();
			dOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end main
} // end class Done!!!!