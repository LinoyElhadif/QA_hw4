package task4triangle.task4triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_triangle {
	Triangle_classification tester= new Triangle_classification();
	
	@Test
	public void Tc1() {
		String result = tester.classifyTriangle(1,2,10);
		String expected = "Nottriangle";
		
		assertEquals(expected, result);
	}
	@Test
	public void Tc2() {
		String result = tester.classifyTriangle(1,10,3);
		String expected = "Nottriangle";
		
		assertEquals(expected, result);
	}
	@Test
	public void Tc3() {
		String result = tester.classifyTriangle(10,2,3);
		String expected = "Nottriangle";
		
		assertEquals(expected, result);
	}
	@Test
	public void Tc4() {
		String result = tester.classifyTriangle(4,5,5);
		String expected = "isosceles";
		
		assertEquals(expected, result);
	}
	@Test
	public void Tc5() {
		String result = tester.classifyTriangle(3,2,3);
		String expected = "isosceles";
		
		assertEquals(expected, result);
	}
	@Test
	public void Tc6() {
		String result = tester.classifyTriangle(3,4,5);
		String expected = "Scalene";
		
		assertEquals(expected, result);
	}
	@Test
	public void Tc7() {
		String result = tester.classifyTriangle(3,3,4);
		String expected = "isosceles";
		
		assertEquals(expected, result);
	}
	@Test
	public void Tc8() {
		String result = tester.classifyTriangle(3,3,3);
		String expected = "equilateral";
		
		assertEquals(expected, result);

}

}
