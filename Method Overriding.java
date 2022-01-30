package oops;


class X
{
	public void show()
	{
		System.out.println("in X");
	}
}

class Y extends X
{
	public void show() // this method of sub class overriding the method of super class
	{
		super.show();// if we remove this line, we will only get "in Y" as output as only show() in sub class will be executed.
		System.out.println("in Y");
	}
}

public class MethodOverriding {

	public static void main(String[] args) 
	{	
		
		X obj = new Y();
		obj.show();

	}

}


//output: in X
//        in Y
