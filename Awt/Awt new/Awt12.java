import java.awt.*;
import java.awt.event.*;
class Awt12 extends Frame
{
 	
	GridLayout g = new GridLayout(4,3);
    	setLayout(g);
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Button b1,b2;
	Checkbox c1,c2;
	Awt12()
	{
	l1=new Label("NAME");
	l2=new Label("MOB");
	l3=new Label("Branch");
	l4=new Label("Gender");
	b1=new Button("OK");
	b2=new Button("CANCEL");
	c1=new Checkbox("MALE");
	c2=new Checkbox("FEMALE");
	t1=new TextField(" ");
	t2=new TextField(" ");
	t3=new TextField(" ");
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(l3);
	add(t3);
	add(l4);
	add(c1);
	add(c2);
	add(b1);
	add(b2);
	}
	public static void main(String []args)
	{
	Awt12 a = new Awt12();
	a.setSize(500,600);
	a.setVisible(true);
	}


	
}