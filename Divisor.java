import java.util.Scanner;
class Divisor
{
public static void main(String [] args)
{
int i,n;
Scanner Sc = new Scanner (System.in);
n=Sc.nextInt();
for(i=1; i<=n/2; i=i+1)
{
	if(n%i==0)
	

	{
	System.out.println(i);
	}

}
}
}
