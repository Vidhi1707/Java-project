import java.util.Scanner;
class Or{
public static void main(String [] args)
{
int a;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter any value=  ") ;
a=Sc.nextInt();
if(a%3==0||a%5==0)
{
System.out.println("IT IS divisible by 3 OR 5" +a);
}
else
{
System.out.println("This Number is not divisible by 3 OR 5");
}
}
}