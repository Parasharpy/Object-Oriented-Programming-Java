package oops;

interface Abc //function interface as it has only one method
{
	void show();
}

public class AnonymousClassWithJava {

	public static void main(String[] args) 
	{
		Abc obj = () -> System.out.println("I AM THE BEST"); //lambda expression
		// lambda expression is only possible with functional interface
		obj.show();

	}

}
