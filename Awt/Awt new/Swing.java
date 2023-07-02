import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Swing  extends JFrame implements ActionListener
{
 	JLabel l1,l2,l3;
	JTextField t1;
	JRadioButton r1,r2;
	JComboBox c1;
	JButton b1;
	Swing()
	{
		l1=new JLabel("NAME");
		l2=new JLabel("BRANCH");
		l3=new JLabel("GENDER");
		b1=new JButton("SAVE");
		c1=new JComboBox();
		c1.addItem("IT");
		c1.addItem("AI");
		c1.addItem("CSE");
		c1.addItem("DS");
		
		r1=new JRadioButton("MALE");
		r2=new JRadioButton("FEMALE");
	
		t1=new JTextField();
		ButtonGroup bg= new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		add(l1);
		add(t1);
		add(l2);
		add(c1);
		add(l3);
		add(r1);
		add(r2);
		add(b1);
		setLayout(null);
    	l1.setBounds(100,40,80,40);
    	t1.setBounds(190,40,80,40);
    	l2.setBounds(100,90,80,40);
    	c1.setBounds(190,90,80,40);
    	l3.setBounds(100,140,80,40);
    	r1.setBounds(190,160,60,60);
    	r2.setBounds(250,200,60,60);
    	b1.setBounds(100,190,80,60);
    	b1.addActionListener(this);
    	

	}
	public static void main (String []args)
	{
		Swing s = new Swing();
		s.setSize(600,400);
		s.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String g= "";
			String a= t1.getText();
			String b= c1.getSelectedItem().toString();
		if(r1.isSelected())
		{
			g=r1.getText();
		}
		else{
			g=r2.getText();
			}
			System.out.println(a);
			System.out.println(b);
			System.out.println(g);

		}
		}
	}
