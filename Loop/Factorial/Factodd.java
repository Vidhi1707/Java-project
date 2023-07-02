import java.util.Scanner;
class Factodd
{
public static void main(String [] args)
{
int n,i,f=1;
for(n=7; n>=1; n=n-2)
{
for(i=n;i>=1;i=i-1)

	{
	f=f*i;
	}


System.out.println(f);
	f=1;
}
}
}
