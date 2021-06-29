import java.io.*;
class EvenOdd
{
public static void main(String args[])
{
int n=123,rem;
int even=0,odd=0;
while(n>0)
{
rem=n%10;
if(rem%2==0)
   even++;
else  
  odd++;
n=n/10;
}
System.out.println("Even numbers:"+even);
System.out.println("Odd numbers:"+odd);
}
}