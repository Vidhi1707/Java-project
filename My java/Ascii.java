import java.util.Scanner;
class Ascii
{
public static void main(String [] args)
{
char c;
Scanner Sc=new Scanner(System.in);
System.out.println("Enter Anything: ");
c= Sc.next().charAt(0);
if(c>=65 && c<=90)
{
System.out.println("UPPER CASE");
}
else if ( c>=97 && c<=122)
{
System.out.println("LOWER CASE");
}
else if (c>=48 && c<=57)
{
System.out.println("DIGIT");
}
else
{
System.out.println("SPECIAL SYMBOL");
}
}
}