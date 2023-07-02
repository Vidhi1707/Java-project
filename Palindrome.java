import java.util.Scanner;
class Palindrome{
public static void main(String [] args)
{
int a,b,m,r=0;
Scanner Sc = new Scanner(System.in);
a= Sc.nextInt();
m=a;
while(a!=0)
{
	b=a%10;
	r=r*10+b;
	a=a/10;
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

