

import java.util.Scanner;

public class FactorialFromRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Number: ");
		
		int range=sc.nextInt();
		factorial(range);
		

	}
	
	public static void factorial(int range)
	{
		for(int i=1;i<=range;i++)
		{
			int prod=1;
			for(int j=1;j<=i;j++)
			{
				prod=prod*i;
			}
			System.out.println(i+"! = "+prod);
		}
	}

}
