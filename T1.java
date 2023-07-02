import java.util.Scanner;
class Stud2{
private int roll;
private String name;
private String branch;

public void set (int roll,String name,String Branch)
	{
	this.roll = roll;
	this.name = name;
	this.branch = branch;
	}
public int getroll()
	{
	return roll;
	}
public String getname()
	{
	return name;
	}
public String getbranch()
	{
	 return branch;
	}
	
}
class Mark extends Stud2
{
private float m1,m2,m3,t;
public void set(float m1,float m2,float m3)
	{
	this.m1=m1;
	this.m2=m2;
	this.m3= m3;
	}
public float getmarks()
	{
	return (m1+m2+m3);
	}

}
class T1
{
public static void main(String [] args)
{
Scanner Sc = new Scanner(System.in);
Mark m = new Mark();
m.set(12,"Ashi","Cse");
m.set(4,5,6);
System.out.println(m.getroll());
System.out.println(m.getname());
System.out.println(m.getmarks());
}
}

