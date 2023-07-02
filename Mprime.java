import java.util.Scanner;
class Mprime{
void pm()
{
int i,n,c=0;
Scanner Sc = new Scanner(System.in);
n=Sc.nextInt();
for(i=2;i<n;i++)
{
	if(n%i == 0)
	{
	c++;
	}
}
if(c==0)
{
System.out.println("PRIME NO = " +n);
}
else
{
System.out.println("NOT PRIME NO = "+n);
}
}
public static void main(String [] args)
{
Mprime p =new Mprime();
p.pm();
}
}	