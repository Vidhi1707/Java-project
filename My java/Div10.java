import java.util.Scanner;
class Div10
{
public static void main(String [] args)
{
int i,n,s=0;
Scanner Sc = new Scanner (System.in);
n=Sc.nextInt();
for(i=1; i<=n/2; i=i+1)
{
	if(n%i==0)
	{
	s=s+i;
	}
}	
System.out.println(s);

}
}

