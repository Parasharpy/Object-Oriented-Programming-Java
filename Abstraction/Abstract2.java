package oops;

abstract class Writer //abstract class
{
        //abstract methods
	public abstract void write();
	public abstract void erase();
}

class Pen extends Writer
{
        //abstract methods of abstract class need to be present inside concrete class which extends it
        public void write()
	{
		System.out.println("I am a pen");
	}
	
	public void erase()
	{
		System.out.println("I am unerasable");
	}
}

class Pencil extends Writer
{
	//abstract methods of abstract class need to be present inside concrete class which extends it
        public void write()
	{
		System.out.println("I am a pencil");
	}
	
	public void erase()
	{
		System.out.println("I am erasable");
	}
}

class Kit
{
	public void dosomething(Writer ref) //reference to abstract class which holds some common functionality
	{
		ref.write();
		ref.erase();
	}
}

public class AbstractNewDemo {

	public static void main(String[] args) 
	{
		Kit obj = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		
		obj.dosomething(p);
		obj.dosomething(pc);
	}

}


//output: I am a pen
//        I am unerasable
//        I am a pencil
//        I am erasable
