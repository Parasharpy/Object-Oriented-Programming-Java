package oops;

interface money
{
	void currency();
	default void value()
	{
		System.out.println("in value");
	}
}

class Inr implements money
{
	public void currency()
	{
		System.out.println("in currency");
	}
}

public class Interface {

	public static void main(String[] args) 
	{
		money obj = new Inr();
		obj.currency();
		obj.value();

	}

}



//output: in currency
//        in value
