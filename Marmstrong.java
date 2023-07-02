import java.util.Scanner;
class Marmstrong{
void strong()
{
int n,b,s=0,m=0;
Scanner Sc =new Scanner(System.in);
n= Sc.nextInt();
while(n!=0)
{
b=n%10;
s=s+(b*b*b);
n=n/10;
}
if(s==m)
{
System.out.println("AMSTRONG NO");
}
else
{
System.out.println("NOT AN ARMSTRONG NO");
}
}
public static void main(String []args)
{
Marmstrong a=new Marmstrong();
a.strong();
}
}