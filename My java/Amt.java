import java.util.Scanner;
class Amt
{
public static void main(String []args)
{
int a ,amt;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter Amount :  ");
amt=Sc.nextInt();   
if (amt >= 500);
{
a = amt/500;
System.out.println("Total no of 500 notes =  "+a);
amt = amt %500;
}
if (amt >= 200);
{
a = amt/200;
System.out.println("Total no of 200 notes = "+a);
amt = amt %200;
}
if (amt >= 100);
{
a = amt/100;
System.out.println("Total no of 100 notes =  "+a);
amt = amt %100;
}
if (amt >= 50);
{
a = amt/50;
System.out.println("Total no of 50 notes = "+a);
amt = amt %50;
}
if (amt >= 20);
{
a = amt/20;
System.out.println("Total no of 20 notes =  "+a);
amt = amt %20;
}
if (amt >= 10);
{
a = amt/10;
System.out.println("Total no of 10 notes = "+a);
amt = amt %10;
}
}
}

