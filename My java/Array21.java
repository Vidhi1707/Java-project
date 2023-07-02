import java.util.Scanner;
class Array21{
public static void main(String [] args)
{
Scanner Sc = new Scanner(System.in);
System.out.print("Enter any 5 no =  ");
int[]x = new int[5];
int i;
for(i=0;i<5;i++)
{
x[i] = Sc.nextInt();
}
for(i=0;i<5;i++)
{
System.out.println(x[i]);
}
}
}
