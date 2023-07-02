import java.util.Scanner;
class Whmax
{
public static void main (String [] args)
{
int n,b,m=0;
Scanner Sc = new Scanner(System.in);
n= Sc.nextInt();
while(n!=0)
{
	b=n%10;
	if(m<b)
	{
	m=b;
	}
	n=n/10;
}
System.out.println(m);
}
}