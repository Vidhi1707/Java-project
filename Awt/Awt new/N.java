import java.awt.*;
import java.awt.event.*;
class N extends Frame
{
	Button b1,b2,b3,b4;
	N()
	{
	b1=new Button("OK");
	b2=new Button("CANCEL");
	b3=new Button("X");
	b4=new Button("Y");
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	setLayout(null);
	b1.setBounds(100,80,70,30);
	b2.setBounds(180,80,70,30);
	b3.setBounds(100,120,70,30);
	b4.setBounds(180,120,70,30);
	}
	public static void main(String []args)
	{
	N a = new N();
	a.setSize(400,300);
	a.setVisible(true);
	}
}