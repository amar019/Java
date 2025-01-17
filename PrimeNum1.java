
import java.util.Scanner;

public class PrimeNum1 {
	
	
	public static String prime(int n)
	{
	boolean flag=true;
	
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			flag=false;
			break;
		}
		
	}
	

	if(flag)
	{
		return n+": is a prime num";
	}else
	{
		return n+": is  not a prime number";
	}
	
	
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int n=sc.nextInt();
		String ans=prime(n);
		
		System.out.println(ans);

	}

}
