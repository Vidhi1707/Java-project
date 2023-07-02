import java.awt.*;
import java.awt.event.*;
class C extends Frame implements ActionListener
{
	C()
	{
	Choice c1,c2;
	Button b1;
	GridLayout g = new GridLayout(4,1);
	setLayout(g);
	c1=new Choice("CSE");
	c2=new Choice("AI");
	c3=new Choice("DS");
	b1=new Button("OK");
	add(c1);
	add(c2);
	add(c3);
	add(b1);
	}
	public static void main(String []args)
	{
	C a=new C();
	a.setSize(500,400);
	a.setVisible(true);
	}
}
