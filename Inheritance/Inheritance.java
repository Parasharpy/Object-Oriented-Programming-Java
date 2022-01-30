package oops;

class CalSimple  //super class
{
	public int add(int i, int j)
	{
		return i+j;
	}
}

class CalAdv extends CalSimple //single level inheritance, sub class
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}

class CalVeryAdv extends CalAdv //multilevel inheritance
{
	public int multi(int i, int j)
	{
		return i*j;
	}
}

//Java doesn't support multiple inheritance because of ambiguity problem (VVI)

public class Inheritance {

	public static void main(String[] args) 
	{
		
		CalVeryAdv obj = new CalVeryAdv();
		int result1 = obj.add(5, 6);
		int result2 = obj.sub(5, 6);
		int result3 = obj.multi(5, 6);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}

//output: 11
//        -1
//        30
