import java.io.*;
import java.util.*;
class leapYear
{
public static void main(String ar[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
n=sc.nextInt();
if(((n%4)==0)&&((n%400)==0)&&((n%100)!=0))
{
System.out.println("Given year is a leap year");
}
else
{
System.out.println("Given year is not a leap year");
}
}
}