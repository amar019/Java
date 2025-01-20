
import java.util.*;

public class FactoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Number: ");
		
		int n=sc.nextInt();
		int ans=factorial(n);
		System.out.println(n+"! = "+ans);

	}
	
	
	public static int  factorial(int n)
	{
		int prod=1;
		for(int i=1;i<=n;i++)
		{
			prod=prod*i;
		}
		
		return prod;
		
	}

}
