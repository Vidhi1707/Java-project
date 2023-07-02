import java.util.Scanner;
class Minmax
{
void mm()
{
int b,n, m1, m2;
m1=0; m2=9;
Scanner Sc = new Scanner(System.in);
n= Sc.nextInt();
while(n!=0)
	{
	b=n%10;
	if (m2>b)
		{
		m2=b;
		}
	if (m1<b)
		{
		m1=b;
		}
	n=n/10;
	}
System.out.println(m1+m2);
}
public static void main(String [] args)
{
Minmax m= new Minmax();
m.mm();
}
}