import java.util.*;
class Stack1{
public static void main(String []args)
{
Stack<Integer> s=new Stack<Integer>();

	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);

for(int v:s)
{
	System.out.println(v);
}
	System.out.println(s.pop());
}
}