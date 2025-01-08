import java.util.Scanner;

public class RightAlphTri {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of rows");
        int n=sc.nextInt();

        int A=65;

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char) (A+i)+" ");
            }

            System.out.println(" ");
        }
    }
    
}
