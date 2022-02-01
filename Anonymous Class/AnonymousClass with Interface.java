package oops;

interface Abc
{
	void show();
}

public class AnonymousClassWithJava {

	public static void main(String[] args) 
	{
		Abc obj =  new Abc() //creating the object of interface with the help of anonymous class
				{
			        public void show()
			        {
			        	System.out.println("I AM THE BEST");
			        }

				};
		obj.show();

	}

}



//output: I AM THE BEST
