import java.util.Scanner;
class Perfect
{
public static void main(String [] args)
{
int i,n,s=0;
Scanner Sc =new Scanner (System.in);
n=Sc.nextInt();
for(i=1; i<=n/2; i=i+1)
{
	if(n%i==0)
	{
	s=s+i;
	}
}
if(s==n)
{
System.out.println("PERFECT NO");
}
else
{
System.out.println("IMPERFECT NO");
}
}
}