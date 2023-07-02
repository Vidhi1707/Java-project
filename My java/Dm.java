import java.util.Scanner;
class Dm{
void add()
{
int a,b,c;
Scanner Sc = new Scanner(System.in);
a=Sc.nextInt();
b=Sc.nextInt();
c=a+b;
System.out.println(c);
}
public static void main(String [] args)
{
Dm d=new Dm();
d.add();
}
}

