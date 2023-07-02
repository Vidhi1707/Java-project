import java.util.Scanner;
class Leapyr
{
public static void main(String []args)
{
int y;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter year : ");
y=Sc.nextInt();
if((y%4==0&&y%100!=0)||(y%100==0&&y%400==0))
{
System.out.println("LEAP YEAR");
}
else
{
System.out.println("NOT A LEAP YEAR");
}
}
}