import java.util.Scanner;
class Charvo
{
public static void main (String []args)
{
char c ;
Scanner Sc = new Scanner(System.in);
System.out.println("Enter Any ALPHABET : ");
c = Sc.next().charAt(0);
if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
System.out.println("VOWELS");
}
else
{
System.out.println("CONSONANT");
}
}
}