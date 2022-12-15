package JavaActivity.javaAvtivity;

public class Calculator {
	
	public int addition(int num1 ,int num2)
	{
		return num1+num2;
	}
	public int subtraction(int num1 ,int num2)
	{
		return num1-num2;
	}
	public int multiply(int num1 ,int num2)
	{
		return num1*num2;
	}
	public int divide(int num1 ,int num2)
	{
		if(num2 == 0)
		{
		 throw new IllegalArgumentException();
		}
		return num1/num2;
	}
	
//	{
//		return a/b;
//	}
}
