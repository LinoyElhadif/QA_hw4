package task4triangle.task4triangle;

public class Triangle_classification {

	enum Triangle_Types {
	equilateral,
	isosceles,
	Scalene,
	Nottriangle,
	ERROR

	}



	public static String classifyTriangle(int a, int b, int c) {

	Triangle_Types triangle;
	if((c < a+b) && (b < a+c) && (a < b+c) )
	{
	if((a==b) && (b==c) )
	triangle= Triangle_Types.equilateral;
	else if ((a==b) || (b==c) || (a==c))
	triangle= Triangle_Types.isosceles;
	else
	triangle= Triangle_Types.Scalene;

	}
	else
	triangle= Triangle_Types.Nottriangle;

	return triangle.toString();
	}

}
