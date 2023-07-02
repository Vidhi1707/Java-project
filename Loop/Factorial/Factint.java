import java.util.Scanner;
class Factint                                 
{
public static void main(String [] args)
{
int n,b,i,f=1,s=0;
Scanner Sc = new Scanner(System.in);
n=Sc.nextInt();
while(n!=0)
{
	b=n%10;
for(i=b;i>=1;i=i-1)

	{
	f=f*i;
	s=f+s;
	}
	System.out.println(s);
	f=1;

n=n/10;	

}
}
}