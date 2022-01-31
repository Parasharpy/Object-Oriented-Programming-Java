package oops;

final class P
{
	public final void show()
	{
		System.out.println("in show");
	}
}

class Q extends P // ERROR, if we make a class final, it won't get extended
{
	public void show()
	{
		
	}
}

class R
{
	public final void show()
	{
		System.out.println("in show");
	}
}

class T extends R 
{
	public void show() //ERROR, we can't override a final method
	{
		
	}
}

public class FinalKeyword {

	public static void main(String[] args) 
	{
		final int i = 10;
		i = 11; // ERROR, once we make a variable final, we can't change it
		
	
	}

}
