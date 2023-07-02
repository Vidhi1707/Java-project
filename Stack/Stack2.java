import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
class Stack2{
	public static void main(String []args)
{
		Scanner sc= new Scanner(System.in);
	
		ArrayList<String> s=new ArrayList<String>();
		Stack<Integer> St=new Stack<Integer>();
		System.out.println("Enter A NUMBER");
		for(int i=1;i<=5;i++)
			{
			St.push(sc.nextInt());
			}
		System.out.println("Enter A SYMBOL");
		for(int i=1;i<=4;i++)	
			{
			s.add(sc.next());
			}
	int a,b;
	String l;
	for (String v:s)
	{
	a=St.pop();
	b=St.pop();
	
	if(v.equals("*"))
	{
	St.push(a*b);
	}
	if(v.equals("+"))
	{
	St.push(a+b);
	}
	
}
System.out.println(St.pop());
}
}