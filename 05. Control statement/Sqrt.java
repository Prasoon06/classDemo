import java.util.Scanner;
class Sqrt{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		double number=sc.nextDouble();
		System.out.printf("Square root is : %.5f",sqrt(number));

	}
	static double sqrt(double n)
	{
		double i=1;
		while(true)
		{
			if(i*i==n)
			{
				return i;
			}
			else if(i*i>n)
			{
				double res= bin(n,i-1,i);
				return res;						
			}
		i++;
		}
	}
	static double bin(double n,double start,double end)
	{
		double mid=(start+end)/2;
		double mul=mid*mid;
		if((mul==n)||(Math.abs(mul-n)<0.00001))
			return mid;
		else if(mul<n)
			return bin(n,mid,end);
		else
			return bin(n,start,mid);
	}
}