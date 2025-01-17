

import java.util.Scanner;

//Given an integer n,return the number of prime numbers that are strictly less than n,
//Example1:
//input: n=10
//output: 4
//Explanation: there are 4 prime numbers less than 10, they are 2,3,5,7

public class CountPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int range=sc.nextInt();
		int ans=prime(range);
		System.out.println("the total no.of prime numbers between "+"1 to "+range +" is: "+ ans);
		

	}
	
	
	public static int prime(int n)
	{
		int isprime=0;
		
		for(int a=1;a<=n;a++)
		{
			int count=0;
			
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				isprime++;
			}
			
		}
		return isprime;
	}
	
	

}
