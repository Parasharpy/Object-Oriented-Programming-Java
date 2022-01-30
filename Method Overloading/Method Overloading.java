package oops;


class Casio
{
	
	//same method name inside a class with different parameters, known as method overloading
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(double i, double j)
	{
		System.out.println(i+j);
	}
}

public class MethodOverloading {

	public static void main(String[] args) 
	{
		
		Casio obj = new Casio();
		obj.add(3,5);
		obj.add(3.5,4.0);
		obj.add(2,4,6);
	}

}


//output: 8
//        7.5
//        12
