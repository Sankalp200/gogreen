import java.util.*;
 public class fun
{
  public static int calculate(int a, int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String args[])
    {
      
        Scanner sc=new Scanner(System.in);
        int b= sc.nextInt();
        int a= sc.nextInt();
        int sum=calculate(a,b);
        System.out.println("sum="+sum);
        sc.close();
        
    }   
       
}