import java.util.Scanner;
class M{
int a,b;
public static void main(String []args)
{
Scanner Sc = new Scanner(System.in);
M x = new M();
M y = new M();
M z = new M();
System.out.println("Enter 2 no for object =  ");
}

x.a = Sc.nextInt();
x.b = Sc.nextInt();

System.out.println("Enter 2 no for object = ");

y.a = Sc.nextInt();
y.b = Sc.nextInt();
z.a = y.a+x.a;
z.b = y.b+x.b;
System.out.println(z.a+" "+z.b);
}

