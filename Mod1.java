import java.util.Scanner;
class Mod1{
public static void main(String[] arg)
{
int a,b,c,d,e,f;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter any value = ");
a=Sc.nextInt();

b=a%10;
System.out.println(+b);
a=a/10;
c=a%10;
System.out.println(+c);
a=a/10;
d=a%10;
System.out.println(+d);
a=a/10;
e=a%10;
System.out.println(+e);
a=a/10;
f=a%10;
System.out.println(+f);
}
}
