package oops;



class Calculator
{
	
	int num1;
	int num2;
	String operation;
	
	public Calculator() //default constructor
	{
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
	}
	
	public Calculator(int i, int j, String op) //constructor overloading
	{
		num1 = i;
		num2 = j;
		operation = op;
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj = new Calculator(2,5,"Overloading");
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		System.out.println(obj.operation);

	}

}



//output: 2
//        5
//        Overloading
