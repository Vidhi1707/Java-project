import  java.util.Scanner;
class Mfact{
void fact()
{
int n,i,f=1;
Scanner Sc =new Scanner(System.in);
n=Sc.nextInt();
for(i=n; i>=1; i=i-1)
	{
	f=f*i;
	}
System.out.println(f);
}
public static void main(String [] args)
{
Mfact f= new Mfact();
f.fact();
}
}
