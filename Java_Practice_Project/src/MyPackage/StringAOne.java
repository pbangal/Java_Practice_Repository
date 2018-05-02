package MyPackage;

public class StringAOne {
	
	public static void main(String[]args) {
		
		String str = "java_sql_ruby_selenium_cobol";
		
		String [] arr1 = str.split("_");
		
		for (int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
			
		}
	}

}
