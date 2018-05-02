package MyPackage;

public class Central1 {

	static int k=12;
	
	static void test()
	{
		System.out.println("Test Method");
	}
	
}

class Mainclass1
{
	public static void main(String[]args) {
		
		System.out.println("Main Method");
		System.out.println("k value is  " + Central1.k);
		Central1.test();
	}
}
