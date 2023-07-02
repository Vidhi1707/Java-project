import  java.util.Scanner;
class Mtab{
void tab()
{
int a,i;
Scanner Sc =new Scanner(System.in);
a=Sc.nextInt();
for(i=1; i<=10; i=i+1)
{
System.out.println(a*i);
}
}
public static void main(String [] args)
{
Mtab t = new Mtab();
t.tab();
}
}

