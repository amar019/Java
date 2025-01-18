package Numbers;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number: ");
		
		int range=sc.nextInt();
		sum(range);
		
		

	}
	
	
	public static void sum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		
		System.out.println("Sum Of toatal digit: "+sum);
	}

}

