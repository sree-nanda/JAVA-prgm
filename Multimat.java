import java.util.*;

class Multimat
{
    public static void main(String args[])
    {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter order of first matrix: ");
        int r1 = SC.nextInt();
        int c1 = SC.nextInt();
        System.out.print("Enter order of second matrix: ");
        int r2 = SC.nextInt();
        int c2 = SC.nextInt();
        if(r2!=c1)
            System.out.println("Multiplication not possible!");
        else
        {
            int a[][] = new int[r1][c1];
            int b[][] = new int[r2][c2];
            int c[][] = new int[r1][c2];
            System.out.println("Enter elements of first matrix: ");
            for(int i=0; i<r1; i++)
            {
                System.out.print("Enter elements of Row "+(i+1)+" : ");
                for(int j=0; j<c1; j++)
                {
                    a[i][j] = SC.nextInt();
                }
            }
            System.out.println("Enter elements of second matrix: ");
            for(int i=0; i<r2; i++)
            {
                System.out.print("Enter elements of Row "+(i+1)+" : ");
                for(int j=0; j<c2; j++)
                {
                    b[i][j] = SC.nextInt();
                }
            }
            for(int i=0; i<r1; i++)
                for(int j=0; j<c2; j++)
                {    c[i][j]=0;
                    for(int k=0; k<c1; k++)
                        c[i][j]+=a[i][k]*b[k][j];
                }
            System.out.println("Product of the two matrix is: ");
            for(int i=0; i<r1; i++)
            {   for(int j=0; j<c2; j++)
                    System.out.print(c[i][j]+" ");
                System.out.println();
            }
                    
        }
    }
}