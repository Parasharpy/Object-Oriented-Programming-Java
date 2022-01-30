package oops;


class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("in B");
	}
	public B(int i)
	{
		super(i); // even if we don't mention it, super() is present in sub class constructor
		System.out.println("in B int");
	}
}

public class SuperMethod {

	public static void main(String[] args) 
  {
		
		B obj = new B(5);

	}

}


//output: in A int
//        in B int
