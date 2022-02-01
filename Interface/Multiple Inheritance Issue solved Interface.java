package oops;
interface Demo
{
	void abc();
	default void show()
	{
		System.out.println("in demo show");
	}
}

interface MyDemo
{
	default void show()
	{
		System.out.println("in Mydemo show");
	}
}

class D implements Demo, MyDemo
{
	public void abc()
	{
		System.out.println("in abc");
	}
	
	// to tackle multiple inheritance issue (ambiguity problem), we will define the method here
	public void show()
	{
		MyDemo.super.show(); // we are clearly mentioning which show to call
	}
}

public class InterfaceMultipleInheritanceIsuueSolved {

	public static void main(String[] args) 
	{
		Demo obj = new D();
		obj.abc();
		obj.show();

	}

}


//output: in abc
//        in Mydemo show
