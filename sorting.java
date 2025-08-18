import java .util.Scanner;
 class compare
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b)
        {
        System.out.println("equal");
        }
        else
        {
        if(a>=b)
        {
        System.out.println("a");
        }
        else
        {
        
        System.out.println("b");
        }
    }
 }
}