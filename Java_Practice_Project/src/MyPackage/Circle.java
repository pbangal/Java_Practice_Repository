package MyPackage;

public class Circle {

	static void areaCircle(double radius)
	{
		
		double c = 3.14*radius*radius;
		System.out.println("Area of circle is " + c);
	}
	
	public static void main(String[]args) {
		
		areaCircle(5);
	}
}
