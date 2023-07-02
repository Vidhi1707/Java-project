import java.util.Scanner;
class Marks{
public static void main(String[] arg )
{
float m1,m2,m3,t,p;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter any 3 No. = ");
m1=Sc.nextInt();
m2=Sc.nextInt();
m3=Sc.nextInt();
t=(m1+m2+m3);
p=(t*100/300);

if(p>=75 && p<=60)
{
System.out.println("Grade A");
}
else if(p>=60 && p<=74)
{
System.out.println("Grade B");
}
else if (p>=40 && p<=34)
{
System.out.println("Grade C");
}
else
{
System.out.println("FAIL");
}
}
}


