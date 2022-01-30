package oops;

public class WrapperDemo {

	public static void main(String[] args) 
	{
		
		int i = 5;
		String str = "123";
		Integer obj = i; //auto-boxing where, Integer is a wrapper class
		
		System.out.println(obj);
		
		int n = Integer.parseInt(str);
		System.out.println(n);

	}

}


//output: 5
//        123
