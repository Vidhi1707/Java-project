import java.util.Scanner;
class M
{
public void show()
{
System.out.println("A");
}
}
class N extends M
{
public void show()
{
super.show();
System.out.println("B");
}
public static void main(String [] args)
{
N x =new N();
x.show();
}
} 
