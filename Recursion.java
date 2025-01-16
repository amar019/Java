class Recursion
{
	public static void num(int a)
	{
		if(a<=10);
		{
			System.out.println(a);
			a++;
			
		}
		num(a);
	}
	public static void main(String[] args)
	{
		num(1);
	}
}
