package MyPackage;

public class StringArray1 {
	
	public static void main(String[]args) {
		
		String [] arr1; // Declaration
		arr1 = new String [3]; //Allocation
		arr1[0] = "java"; //Initialization
		arr1[1] = "sql";
		arr1[2] = "selenium";
		
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
			
		}
	}

}
