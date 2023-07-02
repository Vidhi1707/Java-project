import java.awt.*;
import java.awt.event.*;
class M1 extends Frame implements ActionListener
{   //EVEN ODD
	Label l1,l2;
	TextField t1;
	Button b1;
	M1()
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
     M1 m=new M1();
     m.setSize(500,400);
     m.setVisible(true);
     }
     public void actionPerformed(ActionEvent e)
     {
     if(e.getSource()==b1)
     {
     int a=Integer.parseInt(t1.getText());
     if(a%2==0)

     {
     l2.setText("EVEN");
     }
     else
     {
     l2.setText("ODD");
     }
     }
 }
}