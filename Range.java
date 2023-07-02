import java.util.Scanner;
class Range{
void prime()
{
int a,b,j,i,n,c=0;
Scanner Sc = new Scanner(System.in); 
a= Sc.nextInt();	
b= Sc.nextInt();
for(i=a;i<=b;i++)
{
	for(j=2;j<i;j++)
	{
	if(i%j==0)
	{
	break;
	}
	}

if(i==j)
{
System.out.println(i);
}
}
}
public static void main(String [] args)
{
Range r=new Range();
r.prime();
}
}

