import java.io.*;
import java.util.*;
class Biggest
{ 
public static void main(String ar[])
{
int a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a,b,c,d values");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
if(a>b)
{
if(a>c)
{
if(a>d)
System.out.println("a is big");
else
System.out.println("d is big");
}
else
{
if(c>d)
System.out.println("c is big");
else
System.out.println("d is big");
}
}
else
{
if(b>c)
{
if(b>d)
System.out.println("b is big");
else
System.out.println("d is big");
}
else
{
if(c>d)
System.out.println("c is big");
else
System.out.println("d is big");
}
}
}
}