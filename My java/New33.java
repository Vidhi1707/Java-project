import java.util.Scanner;
class New33{
public static void main(String[] arg)
{
int a;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter value = ");
a=Sc.nextInt();
if(a>=10000&&a<=99999)
{
System.out.println("VALUE IS VALID ="+a);
}
else
{
System.out.println("VALUE IS INVALID ="+a);
}
}
}