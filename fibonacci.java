package pc339;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int a=0,b=1;
		int sum=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=n;i++)
		{
			sum =a+b;
			
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}

}
