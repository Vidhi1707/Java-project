import java.awt.*;//Factorial
import java.awt.event.*;
class P extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1;
	Button b1;
	P()
	{
	GridLayout g = new GridLayout(2,2);
	setLayout(g);
	l1=new Label("NUM");
	t1=new TextField();
	b1=new Button("OK");
	l2=new Label(" ");
	add(l1);
	add(t1);
	add(b1);
	add(l2);
	b1.addActionListener(this);
	}
	public static void main(String[] args)
     {
     P m=new P();
     m.setSize(500,400);
     m.setVisible(true);
     }
     public void actionPerformed(ActionEvent e)
     {
     if(e.getSource()==b1)
     {
     int i,f=1;
     int n=Integer.parseInt(t1.getText());
     
     for(i=n;i>=1;i=i-1)
     {
     f=f*i;
     }
     l2.setText(" Factorial = "+f);
     }
}}
