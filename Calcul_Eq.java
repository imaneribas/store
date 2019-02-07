import javax.swing.JFrame;
import javax.swing.JTextField;

import IHM.Panneau;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

public class Calcul_Eq extends JFrame implements ActionListener{
private Double a,b,c,delta,x1,x2;
private JTextField T1=new JTextField(""),T2=new JTextField(""),T3=new JTextField("");
private JButton b1=new JButton("Calculer");
private JLabel l1=new JLabel("valeur de a"),l2=new JLabel("valeur de b"),l3=new JLabel("valeur de c"),
               l4=new JLabel("valeur de delta"),l5=new JLabel("valeur de x1"),l6=new JLabel("valeur de x2"),
               l7=new JLabel(""),l8=new JLabel(""),l9=new JLabel("");// pour affichage
               
                 
public Calcul_Eq() {
	super("calaculateur d'équation");
	JPanel p1=new JPanel(new GridLayout(3,4,10,10));
	l7.setBorder(BorderFactory.createLineBorder(Color.black));
	l8.setBorder(BorderFactory.createLineBorder(Color.black));
	l9.setBorder(BorderFactory.createLineBorder(Color.black));
	p1.add(l1);p1.add(T1);p1.add(l4);p1.add(l7);
	p1.add(l2);p1.add(T2);p1.add(l5);p1.add(l8);
	p1.add(l3);p1.add(T3);p1.add(l6);p1.add(l9);
	JPanel p2=new JPanel();
	p2.setLayout(new BoxLayout(p2, BoxLayout.LINE_AXIS));
	p2.add(b1);
    JPanel p3 = new JPanel();
    p3.setLayout(new BoxLayout(p3, BoxLayout.PAGE_AXIS));
	p3.add(p1);p3.add(p2);
	add(p3);
	
	b1.addActionListener(this);
	this.setVisible(true);
	pack();
	setResizable(false);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource()==b1) {
		b=Double.parseDouble(T2.getText());
		a=Double.parseDouble(T1.getText());
		c=Double.parseDouble(T3.getText());
		delta=b*b-4*a*c;
		l7.setText(delta.toString());
		
	}
	
}
public static void main(String [] args) {
	Calcul_Eq p=new Calcul_Eq();
}  }