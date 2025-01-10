class KshapeAlpha
{
  public static void main(String[] args)
  { 
      int A=65;
     for(int i=3;i>=0;i--)
     {
       for(int j=0;j<=i;j++)
       { 
         System.out.print((char)(A+j)+ " ");
       }
       System.out.println();
     }

      int b=65;
	 for(int i=0;i<4;i++)
     {
       for(int j=0;j<=i;j++)
       { 
         System.out.print((char)(b+j)+ " ");
       }
       System.out.println();
     }
  }
}