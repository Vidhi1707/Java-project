import java.util.Scanner;
class New11{
public static void main(String[] arg)
{
int unit , bill;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter Amount = ");
unit = Sc.nextInt();
if (unit>=1&&unit<=100)
{
bill=unit*2;
System.out.println("Bill is " +bill);
}
if (unit>=101&&unit<=200)
{
bill=100*2+(unit-100)*3;
System.out.println("Bill is " +bill);
}
if (unit>=201&&unit<=300)
{
bill=100*2+100*3+(unit-200)*4;
System.out.println("Bill is " +bill);
}
if (unit>=301&&unit<=400)
{ 
bill=100*2+100*3+100*4+(unit-300)*4;
System.out.println("Bill is" +bill);
}
}
}
