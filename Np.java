import java.util.Scanner;
class St{
private int roll;
private String name;
private float marks;

public void set(int r,String n ,float m)
	{
	roll= r;
	name = n;
	marks = m;
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
class Np
{
public static void main(String[] args)
{
St n= new St();
n.set(101,"Khushi",40);
System.out.println("Roll no = "+n.getroll());
System.out.println("Name = "+n.getname());
System.out.println("Marks = "+n.getmarks());
}
}
