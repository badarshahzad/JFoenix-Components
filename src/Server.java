

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	public static void main(String args[]){
		ServerSocket  serverSocket ;
		Socket socket;
		String msgSend;
		Scanner input = new Scanner(System.in);
			try {
				serverSocket = new ServerSocket(3310);
				socket = serverSocket.accept();
				System.out.println("Accepted the request!");
				while(true){		
				
					System.out.println("Server: ");
					PrintStream ps = new PrintStream(socket.getOutputStream());
					msgSend = input.nextLine();
					ps.println("Server: "+ msgSend);
					
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					System.out.println("Message has bee recevid from client : "+ br.readLine());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
