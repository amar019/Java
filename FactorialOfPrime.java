

import java.util.Scanner;

public class FactorialOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Number: ");
		
		int range=sc.nextInt();
		factorial(range);
		

	}
	
	
	public static void factorial(int range)
	{
		for(int n=1;n<=range;n++)
		{
			int count=0;
			
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			
			
			if(count==2)
			{
				int prod=1;
				for(int i=1;i<=n;i++)
				{
					prod=prod*i;
				}
				System.out.println(n+"! = "+prod);
				
				
			}
			
			
		}
		
	}

}


