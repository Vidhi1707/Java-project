import java.util.Scanner;
class Overload{
void show(float a)
{
}
void show(int a)
{
}
void show(int a,int b)
{
}
public static void main(String [] args)
{
Overload x = new Overload();
x.show(5);
x.show(7);
x.show(4,5);
}
}
