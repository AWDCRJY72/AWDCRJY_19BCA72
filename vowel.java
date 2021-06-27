import java.io.*;
import java.util.*;
class vowel
{
public static void main(String ar[])
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any character");
ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println("vowel");
}
else 
{
System.out.println("consonant");
}
}
}













