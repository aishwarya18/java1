import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//  w w  w  .j  a v  a  2s .  c o m
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class Main {
  public static void main(String args[]) {
    JFrame f = new JFrame("JColorChooser Sample");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JButton button1 = new JButton("Pick to Change Background");
	JButton button2 = new JButton("Pick to Change Background");
	final JButton b = new JButton();
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        Color initialBackground = b.getBackground();
        //Color background = JColorChooser.showDialog(null,
            //"JColorChooser Sample", initialBackground);
        
		if (initialBackground != Color.red) {
          b.setBackground(Color.blue);
		  JOptionPane.showMessageDialog(null, "hiiibbb");
        }
		else if(initialBackground == Color.blue)
		{
			b.setBackground(Color.green);
			JOptionPane.showMessageDialog(null, "hiii");
		}
      }
    };
	button1.setBackground(Color.red);
	b.setBackground(button1.getBackground());
    button1.addActionListener(actionListener);
	//button1.setBackground(b.getBackground());
	button2.setBackground(Color.black);
	b.setBackground(button2.getBackground());
	button2.addActionListener(actionListener);
	f.getContentPane().setLayout(null);
	button1.setBounds(0,0,50,50);
    f.add(button1);
	b.setBounds(150,150,10,10);
	button2.setBounds(100,100,50,50);
    f.add(button2);
	f.add(b);
    f.setSize(300, 200);
    f.setVisible(true);
  }

}