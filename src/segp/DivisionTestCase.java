package segp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTestCase {
	
	DivisionTest divisionTest1 = new DivisionTest(1, 2);
	DivisionTest divisionTest2 = new DivisionTest(3, 4);
	
	@Test
	public void test(){
		assertEquals(5, divisionTest1.division());
	}
	
	public void testException(){
		assertEquals(5,divisionTest2.division());
	}
}
