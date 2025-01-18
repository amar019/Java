

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number: ");
		
		int n=sc.nextInt();
		String ans=isPerfect(n);
		System.out.println(ans);
		

	}
	
	public static String isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			
			if(n%i==0)
			{
				sum=sum+i;
				
			}
			
		}
		
		if(sum==n)
		{
			return n+" : is perfect number";
		}else
		{
			return n+" : is not  perfect number";
		}

		
		
	}

}
