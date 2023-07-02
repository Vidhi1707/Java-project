import java.util.Scanner;
class Sum35
{
public static void main(String [] args)
{
int a,b,i,s=0;
Scanner Sc= new Scanner(System.in);
a=Sc.nextInt();
b=Sc.nextInt();
for(i=a;i<=b;i=i+1)
{
	if(i%3==0 || i%5==0)
	{
	s=s+i;
	}
}
System.out.println(s);
}
}