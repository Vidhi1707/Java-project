import java.util.Scanner;
class Data{
int a,b;
public static void main(String [] args)
{
int c;
Scanner Sc = new Scanner(System.in);
Data dl = new Data();
System.out.println("ENTER ANY 2 NO.");
dl.a=Sc.nextInt();
dl.b=Sc.nextInt();
c=dl.a+dl.b;
System.out.println(c);
}
} 