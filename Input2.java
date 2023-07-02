import java.util.Scanner;
class Input2{
public static void main(String[] args)
{
int l,b,a,p;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter Value Of l and b ");

l=Sc.nextInt();
b=Sc.nextInt();
a=l*b;
p=2*(l+b);
System.out.println("area is "+a);
System.out.println("Perimeter is"+p);
}
}

