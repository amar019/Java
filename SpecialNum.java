
//WAJP to check whether the given number is special number or not ?

//sum of digit = 1+9=10
//prod of digit =1*9=9
//prod+sum=19


import java.util.Scanner;

public class SpecialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number: ");
		
		int n=sc.nextInt();
		String ans=special(n);
		System.out.println(ans);
		
		

	}
	
	
	public static String special(int n)
	{
		int temp=n;
		int sum=0;
		int prod=1;
		int total=0;
		
		
		while(n!=0)
		{
			int digit =n%10;
			
			
			 sum=sum+digit;
			
			prod=digit*prod;
			
			
			total=sum+prod;
			n=n/10;
			
			
			
		}
		
		
		
		
		if(total==temp)
		{
			return temp+" : speacial number";
		}else
		{
			return temp+" : Not  speacial number";
		}
		
		
	
	}
	

}


