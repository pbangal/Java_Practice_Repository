package MyPackage;

// Program for declaring array in main method and printing value in External method

public class Array_External_Method {
	
	public static void main(String[]args) {
		
		int [] arr;
		arr = new int[3];
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		
		array(arr);
	}
	
	static void array(int [] arg)
	{
		for (int i=0; i<arg.length; i++)
		{
			System.out.println(arg[i]);
		}
	}
 
}
