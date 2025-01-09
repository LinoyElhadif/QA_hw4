package qa4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import qa4.Triangle_classification;

public class AppTest {
	Triangle_classification t = new Triangle_classification();
	
	@Test
	public void TC1(){
        int a = 1;
        int b = 2;
        int c = 90;
        String result = t.classifyTriangle(a,b,c);
        String expected = "Nottriangle";
        assertEquals(expected, result);
    }
	
	@Test
	public void TC2(){
        int a = 5;
        int b = 80;
        int c = 3;
        String result = t.classifyTriangle(a,b,c);
        String expected = "Nottriangle";
        assertEquals(expected, result);
    }

	@Test
	public void TC3(){
        int a = 70;
        int b = 9;
        int c = 2;
        String result = t.classifyTriangle(a,b,c);
        String expected = "Nottriangle";
        assertEquals(expected, result);
    }
	
	@Test
	public void TC4(){
        int a = 5;
        int b = 6;
        int c = 7;
        String result = t.classifyTriangle(a,b,c);
        String expected = "Scalene";
        assertEquals(expected, result);
    }
	
	@Test
	public void TC5(){
        int a = 7;
        int b = 7;
        int c = 9;
        String result = t.classifyTriangle(a,b,c);
        String expected = "isosceles";
        assertEquals(expected, result);
    }
	
	@Test
	public void TC6(){
        int a = 10;
        int b = 10;
        int c = 10;
        String result = t.classifyTriangle(a,b,c);
        String expected = "equilateral";
        assertEquals(expected, result);
    }
	
	@Test
	public void TC7(){
        int a = 6;
        int b = 8;
        int c = 8;
        String result = t.classifyTriangle(a,b,c);
        String expected = "isosceles";
        assertEquals(expected, result);
    }
	
	@Test
	public void TC8(){
        int a = 9;
        int b = 7;
        int c = 9;
        String result = t.classifyTriangle(a,b,c);
        String expected = "isosceles";
        assertEquals(expected, result);
    }
}
