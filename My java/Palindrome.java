import java.util.Scanner;
class Palindrome{
public static void main(String [] args)
{
int n,b,m,r=0;
Scanner Sc = new Scanner(System.in);
n= Sc.nextInt();
m=n;
while(n!=0)
{
	b=n%10;
	r=r*10+b;
	n=n/10;
}
System.out.println(r);
if(r==m)
{
System.out.println("PALINDROME");
}
else
{
System.out.println("NOT A PALINDROME");
}
}
}

