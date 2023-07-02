import java.util.*;
import java.util.Scanner;
class Hash6{
	public static void main (String[]args)
	{
		
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		int i;

	for(i=1;i<=5;i++)
	{
	System.out.println("ENTER NAME AND MARKS");
	{
		String k=sc.next();
		int v = sc.nextInt();
		h.put(k,v);
	}
		for(String k:h.keySet()){
			System.out.println(k);
		}
	//System.out.println()
	}
}
}
