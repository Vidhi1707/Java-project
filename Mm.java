import java.util.Scanner;
class St2{
private int roll;
private String name;
private float marks;

public void set(int r, String n, float m);
	{
	roll= r;
	name= n;
	marks= m;
	}
public int getroll()
	{
	return roll;
	}
public String getname()
	{
	return name;
	}
public float getmarks()
	{
	return marks;
	} 
}
class Mm
{
public static void main(String [] args)
{
St2 s1= new St2();
St2 s2= new St2();
Scanner Sc = new Scanner(System.in);

System.out.println("Enter Roll no ,Name,Marks for S1");
s1.set(Sc.nextInt(),Sc.next(),Sc.nextfloat());

System.out.println("Enter Roll no ,Name,Marks for S2");
s2.set(Sc.nextInt(),Sc.next(),Sc.nextfloat());
}
}
