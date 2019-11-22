package test.com.accenture.lkm.unitTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.accenture.lkm.unitTesting.Calculator;

public class CalculatorTest {
	Calculator cal ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
		cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
		cal = null;
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int expected = 8;
		int actual = cal.add(6,2);
		assertEquals(expected, actual);
	}
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int expected = 20;
		int actual = 0;
		try {
			actual = cal.divide(200,10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail("Unexpected Exception");
			//e.printStackTrace();
		}
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivideByZero() {
		//fail("Not yet implemented");
		int expected = 0;
		int actual = 0;
		try {
			actual = cal.divide(200,0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("ArithmeticException");
			assert(true);
			//e.printStackTrace();
		}
		assertEquals(expected, actual);
	}

}
