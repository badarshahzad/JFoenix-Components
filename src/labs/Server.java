package labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.sound.midi.Receiver;

public class Server {
	
	public static void main(String args[]){
		ServerSocket  serverSocket ;
		Socket socket;
		String msgSend=null;
		String msgRec = null;
	
		Scanner input = new Scanner(System.in);
			try {
				serverSocket = new ServerSocket(3310);
				socket = serverSocket.accept();
				System.out.println("Accepted the request!");
				Boolean method = false;
				while(true){		
					
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					msgRec = br.readLine();
					System.out.print("Client:"+ msgRec);
					
					//System.out.println("Server: ");
					PrintStream ps = new PrintStream(socket.getOutputStream());
					if(msgRec.equals("doNothing()")){
						ps.print("Server: "+ "doNothing method call");
					}
					else if(msgRec.equals("returnZero()")){
						ps.print("Server: "+ 0);
					}
					
					else if(msgRec.equals("mulBy2")){
						
						ps.print("Server: "+ "Mulitplying");
					}
					else{
						ps.print("else condition");
					}
					
					
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
