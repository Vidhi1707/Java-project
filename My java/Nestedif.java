import java.util.Scanner;
class Nestedif{
public static void main(String[] args)
{
int a,b,c,d,e,s;
Scanner Sc = new Scanner(System.in);
System.out.println("ENTER ANY VALUE = ");
a=Sc.nextInt();
if(a>=1000&&a<=9999)
{
b=a%10;
a=a/10;
c=a%10;
a=a/10;
d=a%10;
a=a/10;
e=a%10;
s=b+c+d+e;
if(s%2==0)
{
System.out.println("SUM IS EVEN = "+s);
}
else 
{
System.out.println("SUM IS ODD = "+s);
}

}
else 
{
System.out.println("INVALID");
}

}
}