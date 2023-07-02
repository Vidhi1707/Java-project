import java.awt.*;
import java.awt.event.*;
class P2 extends Frame implements ActionListener
{   //primeno or not prime no
	Label l1,l2;
	TextField t1;
	Button b1;
	P2()
    {
    	GridLayout g = new GridLayout(3,2);
    	setLayout(g);
     l1=new Label("NUM");
     t1=new TextField();
     b1=new Button("ok");
     l2=new Label(" ");
     add(l1);
     add(t1);
     add(b1);
     add(l2);
    b1.addActionListener(this);
     }
     public static void main(String[] args)
     {
     P2 m=new P2();
     m.setSize(500,400);
     m.setVisible(true);
     }
     public void actionPerformed(ActionEvent e)
     {
     if(e.getSource()==b1)
     {
        int i,c=0;
     int n=Integer.parseInt(t1.getText());
     for(i=2;i<n;i++)
     {
        if(n%i==0)
        {
            c++;
        }
     }
        if(c==0)
     {
     l2.setText("Prime ="+n);
     }
     else
     {
     l2.setText("Not Prime ="+n);
     }
     }
 }
}