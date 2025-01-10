class PascalAlphaTri
{
  public static void main(String[] args)
  {
  int a=65;
    for(int i=1;i<=4;i++)
    {
      for(int j=0;j<i;j++)
      {
         System.out.print((char)(a+j)+" ");
        
      }

      System.out.println();
    }

	int b=65;
	for(int i=2;i>=0;i--)
	  {
		for(int j=0;j<=i;j++)
		  {
			System.out.print((char)(b+j)+" ");
		  }

		  System.out.println();

	  }
  }
}