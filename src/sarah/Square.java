package sarah;

import java.util.Scanner;

public class Square extends Shape {

	@Override
	public int Area(int L,int W) {
		// TODO Auto-generated method stub
		return L*L;
	}

	@Override
	public int Perimeter(int L,int W) {
		// TODO Auto-generated method stub
		return 4*L;
	}


}
