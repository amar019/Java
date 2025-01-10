class ReversePyramidAplha
{
	public static void main(String[] args)
	{
		int a=65;
		for(int i=0;i<=4;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}

			for(int j=0;j<=4-i;j++)
			{
				System.out.print((char) (a+j)+" ");
			}

			System.out.println();

		}
	}

}