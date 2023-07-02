import java.util.Scanner;
class Sum{
public static void main(String[] arg)
{
int a,b,c,d,e,f;
int s;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter any value = ");
a=Sc.nextInt();
b=Sc.nextInt();
c=Sc.nextInt();
d=Sc.nextInt();
e=Sc.nextInt();
f=Sc.nextInt();
s=b+c+d+e+f;
b=a%10;
a=a/10;
c=a%10;
a=a/10;
d=a%10;
a=a/10;
e=a%10;
a=a/10;
f=a%10;

System.out.println("SUM = "+s);
}
}
