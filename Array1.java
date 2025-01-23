

import java.util.Scanner;

public class Array1 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the size of array: ");
	
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		
		addElements(arr);
		
		display(arr);
		
		

	}
	
	
	public static void addElements(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the values at index "+i+": ");
			arr[i]=sc.nextInt();
		}
	}
	
	
	
	
	
	
	
	
	public static void display(int[] arr)
	{	
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");
			  
			 
		}	
		
	}

}
