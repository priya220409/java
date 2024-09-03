package pc339;

import java.util.Scanner;

public class sum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number: ");
		int digit=sc.nextInt();
		
		int sum = 0;
		int count=0;
		while(digit>0)
		{
			int rem=digit%10;
			System.out.print(rem);
			count=count +1;
			sum=sum+rem;
			
			digit= digit/10;
			
			
		}
		System.out.print("\n");
		System.out.println("sum of number is:"+sum);
		System.out.println("digit count is:"+count);
		
	}

}
