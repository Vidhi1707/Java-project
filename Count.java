import java.util.Scanner;
class Count
{
public static void main(String [] args)
{
int a,b,i,c=0;
Scanner Sc = new Scanner (System.in);
a=Sc.nextInt();
b=Sc.nextInt();
for(i=a; i<=b; i=i+1)
{
	if(i%2!=0 )
	{
	c=c+1;
	}
}	
System.out.println(c);

}
}

