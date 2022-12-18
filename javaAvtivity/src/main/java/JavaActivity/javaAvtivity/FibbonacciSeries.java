package JavaActivity.javaAvtivity;

public class FibbonacciSeries {
	 
	int fibbonacciSeries(int number)
	{
//		number = 10;
//		int num1 = 0;
//		int b = 1;
//		
//		int count = 1;
//		while(count <= number)
//		{
//			System.out.println(num1+ "");
//			int sum = num1 + b;
//			num1 = b;
//			b = sum;
//			count++;
//		}
//		//System.out.println(number);
//			
//		
//		return number;
		//int num1 = 0, num2 = 1,num3 = 0;
	//System.out.println("First and second numbers are: " + num1 + " " + num2);
		if(number <= 0)
		{
			return 0;
		}
		else if(number == 1)
		{
			return 1;
		}
		else
		{
			return fibbonacciSeries(number - 1)+fibbonacciSeries(number-2);
		}
	}
}
