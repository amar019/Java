
//WAJP to swap two variables without using third variable;

public class Swap3var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		System.out.println("before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		


	}

}


