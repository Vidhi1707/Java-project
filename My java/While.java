import java.util.Scanner;
class While
{
public static void main(String [] args)
{
int n,b,s=0;
Scanner Sc = new Scanner(System.in);
n= Sc.nextInt();
while(n!=0)
{
b=n%10;
System.out.println(b);
n=n/10;
}
System.out.println(s);
}
}