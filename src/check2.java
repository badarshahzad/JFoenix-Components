
public class check2 {
	public static void main(String args[]){
		check1 ob1 = new check1();
		ob1.age=2;
		ob1.name="a";
		check1 ob2 = new check1();
		ob2.age=3;
		ob2.name="A";
	oYes(ob1,ob2);	
	}

	private static void oYes(check1 ob1, check1 ob2) {
		System.out.println(ob1.age+ob1.name);
		System.out.println(ob2.age+ob2.name);
		
	}
	
}


