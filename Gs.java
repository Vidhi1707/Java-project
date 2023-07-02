import java.util.Scanner;
class Faculty{
private int fid;
private String name;
private float salary;
Faculty()
{
}
Faculty(int fid, String name, float salary)
	{
	this.fid=fid;
	this.name=name;
	this.salary=salary;
	}
public float getgross()
	{
	float hra,da,ta,gs;
	hra = salary*0.05f;
	da=salary*0.06f;
	ta=salary*0.07f;
	gs=(salary+hra+da+ta);
	return gs;
	}
}
class Gs
{
public static void main(String [] args)
{
Scanner Sc = new Scanner(System.in);
System.out.println("Enter id , Name,Salary");
Faculty f = new Faculty(Sc.nextInt(),Sc.next(),Sc.nextFloat());
System.out.println(f.getgross());
}
}
