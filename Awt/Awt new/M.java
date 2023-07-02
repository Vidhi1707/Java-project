import java.awt.*;
import java.awt.event.*;
class M extends Frame implements ActionListener
{
	Button b1,b2;
	M()
	{
		GridLayout g= new GridLayout(1,2);
		setLayout(g);
	b1= new Button("OK");
	b2= new Button("CANCEL");
	add(b1);
	add(b2);

	b1.addActionListener(this);
	b2.addActionListener(this);
	}
	public static void main(String []args)
	{
	M m = new M();
	m.setSize(500,400);
	m.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==b1)
	{
	System.out.println("A");
	}
	if(e.getSource()==b2)
	{
	System.out.println("B");
	}

	}
}