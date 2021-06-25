import java.io.*;
import java.util.*;
class Swapping
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a,b values");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Before Swapping:"+a+" "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping:"+a+" "+b);
}
}