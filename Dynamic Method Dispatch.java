package oops;

//Implementing Dynamic Method Dispatch

class Icc
{
	void show()
	{
		System.out.println("Internation Cricket Councel");
	}
}

class Bcci extends Icc
{
	void show() //overriding show()
	{
		System.out.println("Indian Cricket Board");
	}
}

class Ecb extends Icc
{
	void show() // overriding show()
	{
		System.out.println("England Cricket Board");
	}
}


public class DynamicMethodDispatch {

	public static void main(String[] args) 
	{
		
		 Icc a  = new Icc();
	     Bcci b = new Bcci();
	     Ecb c = new Ecb();

	     Icc ref;    // taking a reference of Icc
	        
	     ref = a;   // r refers to a object in Icc
	     ref.show();   // calling Icc's version of show()
	     
	     ref = b;   // r refers to a object in Bcci
	     ref.show();   // calling Bcci's version of show()

	     ref = c;  // r refers to a object in Ecb
	     ref.show();  // calling Ecb's version of show()

	}

}

//output: Internation Cricket Councel
//        Indian Cricket Board
//        England Cricket Board
