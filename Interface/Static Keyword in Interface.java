package oops;

interface Lichi
{
	void abc();
	static void show()
	{
		System.out.println("Hi, there");
	}
}

public class StaticMethonInInterface {

	public static void main(String[] args)
	{
		Lichi.show();

	}

}


//output: Hi, there
