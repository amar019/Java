

//WAJP to given number is string or not
//1 !=1
//4 !=24
//5!= 120
//1+24+120=145

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int n=sc.nextInt();
		String ans=strong(n);
		 System.out.println(ans);
		
		

	}

	public static String strong(int n)
	{
		int sum=0,temp=n;
		
		while(n!=0)
		{
			int digit = n%10;
			
			int prod=1;
			
			for(int i=1;i<=digit;i++)
			{
				prod=prod*i;
			}
			
			
			
			 sum=sum+prod;
			
			
			n=n/10;
		}
		 System.out.println("sum: "+sum);
		
		 
		 if(temp==sum)
		 {
			 return "Strong Number";
		 }
		 else
		 {
			 return "not strong number";
		 }
		
		
	}
}



