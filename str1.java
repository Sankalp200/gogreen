
class Str
{
    public static void main(String args[])
    {
       //use of stringbuilder
       StringBuilder sb=new StringBuilder("Tony");
       System.out.println(sb);


       // use of CharAt()
       //char at index batata hain kisi bhi string ke character ki
       //charat index 0
       System.out.println(sb.charAt(0));


       //set char at index 0
       //set char at value change karta hai kisi bhi index ki by user define
       sb.setCharAt(0,'p');
       System.out.println(sb);
    }


 }
 //use of compareTo
 //use to compare two strings
 // s1>s2;+ve value
 //s1==s2;0
 //s1<s2; -ve



 //new String() used to make new string 

 //use of substring
 // it is used to print only a part of string
 // substring(begning index, ending index)
 // agr ending index nhi diya to bhi vo apne se le leta hai