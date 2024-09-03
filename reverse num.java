package pc339;

import java.util.Scanner;

public class vhgxvhf {
	public static void call(int digit) {
		int rem;
		if(digit<=0)
			return;
		rem=digit%10;
		digit/=10;
		call(digit);
		System.out.println(rem);
		
	}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr the digit:");
			int digit=sc.nextInt();
	    
			call(digit);
		int result=0;
		while(digit!=0)
		{
			int remainder= digit%10;
			//System.out.println(remainder);
			 digit =digit/10;
		}
		
		
}
}
