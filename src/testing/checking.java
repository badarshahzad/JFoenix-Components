package testing;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class checking {

	public static void main(String args[]) throws IOException{
		
		//byte[] data_length =  String.valueOf(data.length).getBytes("UTF8");
		//System.out.println("abc".getBytes("UTF8"));
		byte[] data = "Hello World".getBytes("UTF8");
		//System.out.println(data.length);
		byte[] initialize = new byte[1];
		initialize[0] = 2;
		
		System.out.println(initialize.length);
		
		byte[] data_length =  String.valueOf(data.length).getBytes("UTF8");
		//System.out.println(data_length.length);
		ObjectOutputStream oos =null;
		Scanner input = new Scanner (System.in);
		byte message ;
		System.out.print("Server :");
		//message = input.;
		byte[] msg = new byte[1];
		//msg[0] = message;
		oos.writeByte(msg[0]);
		//oos.writeObject("Server: " + message);
		//System.out.println(message);
		
	}
}
