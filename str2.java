
class Str2
{
    public static void main(String args[])
    {
       //use of stringbuilder
       StringBuilder sb=new StringBuilder("Tony");
       System.out.println(sb);

        sb.insert(2,'n');
        System.out.println(sb);

        //delete the extra
        sb.delete(2,3);
        System.out.println(sb);
        
    }
}