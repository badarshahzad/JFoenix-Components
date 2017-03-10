

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String args[]) {
		
		String msgSend;
		Socket client;
		try {

			//Making conenction with server
			client = new Socket("localhost", 3310);
			System.out.println("Request sent successfully");
			Scanner input = new Scanner(System.in);
			while (true) {

				// server msg receive!
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				System.out.println(br.readLine());

				// Client msg sending to server!
				PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
				// pw.println(args[0]);
				msgSend = input.nextLine();
				System.out.print("Cient: ");
				pw.println("Client: I need this method " + msgSend);

		}
		}catch (Exception ex) {
			System.out.println(ex);
		}
	}
}



