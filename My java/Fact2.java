import java.util.Scanner;
class Fact2
{
public static void main(String [] args)
{
int n,i,f=1;

for(n=5;n>=1;n=n-1)
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