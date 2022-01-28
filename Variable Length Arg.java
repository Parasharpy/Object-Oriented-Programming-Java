package oops;


class Var
{
	public int add(int ... n) //for variable length argument, we use three dots
	{
		int sum = 0;
		for(int k:n)
		{
			sum = sum + k;
		}
		return sum;
	}
}

public class VariableLengthArguments {

	public static void main(String[] args) 
	{
    
		Var obj = new Var();
		System.out.println(obj.add(4,5,6,7,8,8,4));

	}

}

//output: 42
