package oops;

abstract class Human //abstract class
{
	public abstract void dress(); //declared abstract method
}

class Men extends Human // this class is called "concrete class"
{
	public void dress() //we are defining the abstract method present in abstract class
	{
		System.out.println("Men wear shirts");
	}
}

class Women extends Human //concrete class
{
	public void dress() //we are defining the abstract method present in abstract class
	{
		System.out.println("Women wear tops");
	}
}

public class AbstractDemo {

	public static void main(String[] args) 
	{
		//we can't create object of an abstract class, but we can use it as a reference
		Human obj1 = new Men();
		Human obj2 = new Women();
		
		obj1.dress();
		obj2.dress();

	}

}


//output: Men wear shirts
//        Women wear tops
