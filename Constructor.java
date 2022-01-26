package oops;

class Calc
{
	int num1;
	int num2;
	
	public Calc() //default constructor, name of the constructor should always be same as class name
	{
		num1 = 5;
		num2 = 3;
		System.out.println("In constructor");
	}
}

public class Constructor {

	public static void main(String[] args) 
	{
		
		Calc myobj = new Calc(); //constructor is automatically called, when we create instance(object) of a class
		System.out.println(myobj.num1);
		System.out.print(myobj.num2);

	}

}


//output: In constructor
//        5
//        3
