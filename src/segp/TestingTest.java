/**
 * 
 */
package segp;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author badar
 *
 */
public class TestingTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this setUp beforeclass annotation @BeforeClass ");
	} 

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("the is tearDownAfterClass  annotation @AfterClass");
	}

	/**
	 * Test method for {@link segp.Testing#message()}.
	 */
	@Test
	public final void testMessage() {
	//	fail("Not yet implemented"); // TODO
	System.out.println("testMessage");
	}

	/**
	 * Test method for {@link segp.Testing#messageWow()}.
	 */
	@Test
	public final void testMessageWow() {
		//fail("Not yet implemented"); // TODO
		System.out.println("testMessageWow");
	}
	/**
	 * Test method for {@link segp.Testing#messageHello()}.
	 */
	@Test
	public final void testMessageHello() {
		//fail("Not yet implemented"); // TODO
		System.out.println("testMessageHello");
	}

	/**
	 * Test method for {@link segp.Testing#messageBy()}.
	 */
	@Test
	public final void testMessageBy() {
		//fail("Not yet implemented"); // TODO
		System.out.println("testMessageBY");
	}

}
