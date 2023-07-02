import java.util.Scanner;
class Greater{
void great()
{
int a,b,c;
Scanner Sc = new Scanner(System.in);
a=Sc.nextInt();
b=Sc.nextInt();
c=Sc.nextInt();
if(a>b &&a>c)
{
System.out.println("A is Greater "); 
}
else if(b>c&&b>a)
{
System.out.println("B is Greater");
}
else
{
System.out.println("C is Greater"); 
}
}
public static void main(String [] args)
{
Greater g = new Greater();
g.great();
}
}

