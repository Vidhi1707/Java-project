import java.util.Scanner;
class Discount{
public static void main(String[] arg)
{
int p1,p2,p3;
int a,d,t;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter any 3 no.");
p1=Sc.nextInt();
p2=Sc.nextInt();
p3=Sc.nextInt();
t=(p1+p2+p3);
d=(t*10/100);
a=(t-d);
System.out.println("TOTAL="+t);
System.out.println("DISCOUNT="+d);
System.out.println("After DISCOUNT="+a);
}
}
