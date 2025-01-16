class Overloading
{
	public static int add(int a,int b)
	{
		return a+b;
	}

	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}

	public static int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}

	public static void main(String[] args)
	{
        int  sum1=add(18,85);
		int  sum2=add(78,65,92);
		int  sum3=add(45,65,10,0);

		System.out.println("sum of 2 num: "+sum1 );
		System.out.println("sum of 3 num: "+sum2 );
		System.out.println("sum of 4 num: "+sum3 );
		
	} 
}