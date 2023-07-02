import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Box2 extends Frame implements ActionListener
{
	Checkbox c1,c2,c3,c4;
	Button b1;
	Label l1;
	Box2()
   	{
	setLayout(null);
	c1= new Checkbox("1");
	c2= new Checkbox("2");
	c3= new Checkbox("3");
	c4= new Checkbox("4");
	l1= new Label(" ");
	b1= new Button("OK");
	add(c1);
	add(c2);
	add(c3);
	add(c4);
	add(b1);
	add(l1);
	c1.setBounds(100,40,40,40);
	c2.setBounds(100,90,40,40);
	c3.setBounds(100,140,40,40);
	c4.setBounds(100,190,40,40);
	b1.setBounds(100,230,80,40);
	l1.setBounds(100,270,190,40);
	
	b1.addActionListener(this);
	}
	public static void main(String []args)
	{
	Box2 a = new Box2();
	a.setSize(600,400);
	a.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			int s=0;
			if(c1.getState())
			{
				 s=s+Integer.parseInt(c1.getLabel());
			}
			if(c2.getState())
			{
				s=s+Integer.parseInt(c2.getLabel());
			}
			if(c3.getState())
			{
				 s=s+Integer.parseInt(c3.getLabel());
			}
			if(c4.getState())
			{
				 s=s+Integer.parseInt(c4.getLabel());
			}
			l1.setText("SUM OF CHECKED BOXES: "+s);
		}
	}

} 



