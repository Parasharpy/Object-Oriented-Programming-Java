package oops;

class Info
{
	private int rollno;
	private String name;
	
	public void setRollno(int r) // setters
	{
		rollno = r;
	}
	
	public int getRollno() // getters
	{
		return rollno;
	}
	
	public void setName(String r)
	{
		name = r;
	}
	
	public String getName()
	{
		return name;
	}
}

public class Encapsulation {

	public static void main(String[] args) 
	{	
		
		Info obj = new Info();
    
    // we are accessing our data with the help of methods
		
		obj.setRollno(2);
		System.out.println(obj.getRollno());
		
		obj.setName("Mayank");
		System.out.println(obj.getName());


	}

}


//output: 2
//        Mayank
