import java.util.Scanner;
class arr2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int ar[][]=new int[rows][col];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                ar[i][j]=sc.nextInt();
                
            }
        }
        int x=sc.nextInt();
         for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(ar[i][j]==x)
                {
                    System.out.println("location"+i+","
                    +j);
                }
            }
        }
    }

    
}