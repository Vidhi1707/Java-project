import java.util.Scanner;
class Fact
{
public static void main(String [] args)
{
int n,i,f=1;
Scanner Sc= new Scanner(System.in);
n=Sc.nextInt();
for(i=n;i>=1;i=i-1)

	{
	f=f*i;
	}

	System.out.println(f);
}
}