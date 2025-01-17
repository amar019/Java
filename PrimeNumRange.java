package Numbers;

import java.util.Scanner;

public class PrimeNumRange {
	
	
	public static void prime(int n)
	{
		System.out.println("1 to " +n+ " range of prime numbers: ");
		for(int a=1;a<=n;a++)
		{
			
			int count =0;//for each number we need to reinitialize
			
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					count++;
					
				}
			}
			
			if(count==2)
			{
				
				System.out.println(a);
			}
			
		}
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int range=sc.nextInt();
		prime(range);
		
		
		
		

	}

	
	

}
