package Numbers;
//WAJP to find number of digits in given number

import java.util.Scanner;

public class FindNoDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Number: ");
		
		int n=sc.nextInt();
		int ans=findNoDigit(n);
		System.out.println("NO.OF.DIGIT: "+ans);


	}
	
	
	public static int findNoDigit(int n)
	{
		int count=0;
		while(n!=0)
		{
			int digit=n%10;
			
			
			n=n/10;
			count++;
		}
		
		return count;
	}
	
	

}




