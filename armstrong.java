package pc339;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit:");
		int digit=sc.nextInt();
    
	int number; 
	int result=0;
	number=digit;
	int numdigits=Integer.toString(number).length();
	while(digit>0)
	{
		int remainder= digit%10;
		System.out.println(remainder);

		 result+= (int)Math.pow(remainder, numdigits);
		 digit =digit/10;
	}
	if(result==number)
	{
	System.out.println("arm strong");
	}
	else
	{
		System.out.println("not arm strong");
	}
}
}
