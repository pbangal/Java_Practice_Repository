package MyPackage;

public class ArrayDemo1 {
	
	public static void main(String[]args) {
		
		int [] array;
		array = new int [4];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		
		System.out.println("Element at index 1 is " + array[0]);
		
		for (int i =0; i<array.length; i++)
		{
			System.out.println(array[i]);
			
		}
	}

}
