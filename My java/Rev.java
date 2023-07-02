import java.util.Scanner;
class Rev{
public static void main(String [] args)
{
int n,b,r=0;
Scanner Sc = new Scanner(System.in);
n= Sc.nextInt();
while(n!=0)
{
	b=n%10;
	r=r*10+b;
	n=n/10;
}
System.out.println(r);
}
}

