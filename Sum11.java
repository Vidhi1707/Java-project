import java.util.Scanner;
class Sum11{
public static void main(String[] args)
{
int a,b,c,d,e,f;
int s;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter any value of a = ");
a=Sc.nextInt();
if (a>=10000&&a<=99999)
{
a=a/10;
a=a%10;
b=a%10;
a=a/10;
c=a%10;
a=a/10;
d=a%10;
a=a/10;
e=a%10;
a=a/10;
f = a%10;
s=b+d+f;

System.out.println("SUM of first middle and last is "+s);
}
else
{
System.out.println("Invalid STATEMENT");
}
}
}