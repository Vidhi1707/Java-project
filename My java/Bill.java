import java.util.Scanner;
class Bill{
public static void main(String[] arg )
{
float b1,b2,b3,u,B;

Scanner Sc = new Scanner(System.in);
System.out.println("Enter any 3 No. = ");
b1=Sc.nextInt();
b2=Sc.nextInt();
b3=Sc.nextInt();
u=(b1+b2+b3);

if(u>=1&&u<=100)
{
B=u*2;
System.out.println("Bill is upto 100 = " +u);
}
else if(u>=101&&u<=200)
{
B=u*3;
System.out.println("Bill is = " +u);
}
else if (u>=201&&u<=300)
{
B=u*4;
System.out.println("Bill is   = " +u);
}
else if (u>=301&&u<=400)
{
B=u*5;
System.out.println("Bill is  = " +u);
}
else 
{
System.out.println("Bill is = " +u);
}
}
}


