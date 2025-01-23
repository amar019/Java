

import java.util.Scanner;

public class CreateArrayusingNewKeyword {
	
	 static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("Enter the size of array: ");
	
		int size=sc.nextInt();
		
		String[] arr=new String[size];
		System.out.println("with default values:");
		display(arr);
		
		addElement(arr);
		display(arr);

	}
	
	
	public static void addElement(String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("Enter the values at index "+i+": ");
			sc.nextLine();
			arr[i]=sc.nextLine();
			
		}
		System.out.println("****Succesfully added*****");
	}
	
	
	
	public static void display(String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}

//WAJP to find even elements from the array
