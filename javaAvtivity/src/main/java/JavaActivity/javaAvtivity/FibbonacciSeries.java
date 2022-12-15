package JavaActivity.javaAvtivity;

public class FibbonacciSeries {
	 
	int fibbonacciSeries(int number)
	{
		int num1 = 0, num2 = 1,num3 = 0;
		System.out.println("First and second numbers are: " + num1 + " " + num2);
		for(int i=2; i<number; i++)
		{
			
			num1 = num2;
			num2 = num3;
			 num3 = num1 + num2;
		}
		return num3;
	}
}
