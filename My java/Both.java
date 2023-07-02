import java.util.Scanner;
class Both
{
public static void main (String [] args)
{
int n,b,a,m=0;

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
 int p, r=9;
while(n!=0)
{
	a=n%10;
	if(r>a)
	{
	r=a;
	}
	n=n/10;
}
System.out.println(r);

}
}