
import java.util.*;

public class PrimeNum {
	
	public static String prime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
			
			
			
		}
		
		if(count==0)
		{
			return n+": is a prime";
		}else
		{
			return n+": is not a prime";
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Number: ");
		
		int n=sc.nextInt();
		String ans=prime(n);
		System.out.println(ans);
	}

}
