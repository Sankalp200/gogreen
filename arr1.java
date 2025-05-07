import java.util.Scanner;
class arr1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("enter size");
        size=sc.nextInt();
        int num[]=new int[size];
        for(int i=0;i<size;i++)
        {
        num[i]=sc.nextInt();
        }
          int x=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(num[i]==x)
            System.out.println("size"+i);
        }

    }
}

