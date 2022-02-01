package oops;

class I
{
	public void show()
	{
		System.out.println("in A show");
	}
}

public class AnonymousClass {

	public static void main(String[] args) 
	{
		//we are going to use an anonymous class as we want to use for a single time
		I obj = new I()
				{
			        public void show()
			        {
			        	System.out.println("i am the best");
			        }
				};
		obj.show();
	}

}


//output: i am the best
