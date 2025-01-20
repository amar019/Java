
//WAJP to print fibonacci series

import java.util.Scanner;

public class FibonaciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Number: ");
		
		int n=sc.nextInt();
		fibonacci(n);

	}
	
	public static void fibonacci(int n)
	{
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		int c;
		
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
			
		}
	}

}


