package sarah;

/**
 * 
 * @author badar
 * 
 * Description: Well, Sarah that is awsome paper I learnt a lot. Firstly
 * Sorry I didn't tell you and missed you lot but I was horribly busy
 */
public class Sarah{
	
	public static void main(String args[]){
		int num,y[] = {1,2,3};
		String n1 = "adfa",n2="123.4";
		/*
		 * Well I hope you know what is doing above two lines!
		 * Below is loop that ofcourse you know
		 */
	
		
		for(int x=1;x<=5;x++){
		try{
			if(x==1)
			{
				/*
				  Here the issue start: When you want to parse string in to number
				  then it gave you and exception of Numberformat as you cannot convert stirng 
				  into number or number into string. So catch exception NumberFormat will appear 
				  as Helwan. Remember the difference between print and println
				  	
				  	Example:
				  	String a="123.1";
					System.out.println(Integer.parseInt(a));		Result: NumberForamtException
					
				  	String a="abc";
					System.out.println(Integer.parseInt(a));		Result: NumberForamtException
					
				  	String a="123";
					System.out.println(Integer.parseInt(a));		Result: 123
				  */ 
				 
			num = Integer.parseInt(n1);
				System.out.println("You number is:"+num+".");
			}
			else if(x==2){
				
				 // 1/0 is impossible i think is infinity but here is ArithmeticException that will be Engineering
				 
				System.out.println(x/(x-2));
			}
			else if(x==3){
				//Again above mention Numberformat exception as you cannot conver also a floating point value in integer.
				//Look at above example
				num = Integer.parseInt(n2);
				System.out.println("Your number is :"+num+".");
			}
			//This one is array indexout of bound
			else if(x==4){
				System.out.println(y[x]);
			}
			
		}catch(ArrayStoreException e){
			System.out.print("Computer");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("University");
		}
		catch(ArithmeticException e){
			System.out.println("Engineering");
		}
		catch(NumberFormatException e){
			System.out.print("Helwan");
		}
		//This is parent exception it will not run as we already mention its childs exception abvoes so 
		//it will not run as childs already done their tasks
		catch(Exception e){
			System.out.println("Something went terrible wrong");
		}
		//finally exception is must run exception. In each exception this exception either its "Exception" parent or
		//Child it will run 100% but due to condition if(x==2) it will only show sysout when condtion full fill
		//But remember still it's running every iteration
		finally{
			//Open this below comment line!
			//System.out.println("Hi Sarah! haha :) ");
			if(x==2)
				System.out.println("Successfully here!");
		}
		}
		//This is out of the loop so it will only once! 
		System.out.println("GoodBye");		
		
		//Done! Sorry for being late my friend!
	}

}
