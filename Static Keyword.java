package oops;

class Emp
{
	int eid;
	int salary;
	static String ceo;
	
	static
	{
		ceo = "Larry";
	}
	
	public Emp()
	{
		eid = 1;
		salary = 1000;
	}
	
	public void show()
	{
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
	
}

public class StaticKeyword {

	public static void main(String[] args) 
	{
		
		Emp navin = new Emp();
		navin.eid = 8;
		navin.salary = 4000;
		
		Emp rahul = new Emp();
		rahul.eid = 9;
		rahul.salary = 5000;
		
		
		navin.show();
		rahul.show();

	}

}

//output: 8 : 4000 : Larry
//        9 : 5000 : Larry
