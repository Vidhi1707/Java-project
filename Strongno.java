import java.util.Scanner;
class Strongno                             
{
public static void main(String [] args)
{

Scanner Sc = new Scanner(System.in);
int n=Sc.nextInt();
int num=n ,sum=0,d;
while(n>0)
{
int f=1;	
d=n%10;
for(int i=1;i<=d;i=i+1)

	{
	f=f*i;
	}
	sum =sum+f;
	n=n/10;
	}
if(num==sum)
{
System.out.println("Strong number");
}	
else
{System.out.println("Not a Strong no");
}
}
}
