package Numbers;
//WAJP to find digits of given number

import java.util.Scanner;

public class FindDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Number: ");
		
		int n=sc.nextInt();
		findDigit(n);


	}
	
	public static void findDigit(int n)
	{
		while(n!=0)
		{
			int digit=n%10;
			System.out.println(digit);
			
			n=n/10;
		}
	}

}


