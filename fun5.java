import java.util.Scanner;
 class fun5
 {
    public static int fact(int n)
    {
        
        
       int f=1;
        for(int i=n;i>0;i--)
        {
            f=f*i;
        }
      
        return f;
    }
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int facto=fact(n);
         System.out.println("factorial "+ facto);
         sc.close();


    }
 }