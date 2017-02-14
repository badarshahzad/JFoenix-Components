package sarah;

public class Rectangle extends Shape{

	@Override
	public int Area(int L,int W) {
		// TODO Auto-generated method stub
		return L*W;
	}

	@Override
	public int Perimeter(int L,int W) {
		// TODO Auto-generated method stub
		return 2*(L+W);
	}

}
