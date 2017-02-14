package sarahQuestion3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Sarah {
	
	public static void main(String args[]){
		try{
		BufferedReader br = new BufferedReader(new FileReader("GuessReport.txt"));
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		/*
		BufferedWriter bw = new BufferedWriter(new FileWriter("GuessReport.txt"));
		int a=0;
		while(a<5){ 
			bw.write("A");
			a++;
		}*/
		//bw.close();
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
