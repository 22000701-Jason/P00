import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testadd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 5555;
		assertEquals(expected,actual);
	}
	@Test
	public void testsubtract() {
		int a = 5;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 3;
		assertEquals(expected,actual);
	}
	@Test
	public void testmultiply() {
		int a = 50;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 100;
		assertEquals(expected,actual);
	}
	@Test
	public void testdivide() {
		int a = 25;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 5;
		assertEquals(expected,actual);
	}
	@Test
	public void testdivide2() {
		int a = 25;
		int b = 0;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 0;
		assertEquals(expected,actual);
	}
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
	}
	@AfterClass
	public static void setUpAfterClass() throws Exception{
		
	}

}
