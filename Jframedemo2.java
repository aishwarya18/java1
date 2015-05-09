import java.util.Random;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;



public class Jframedemo2 extends JFrame
{
	int me;
	public static void main(String args[])
	{
		Jframedemo2 j= new Jframedemo2("first");
	}
	public Jframedemo2(String title)
	{
		super(title);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		}
		);
		int i,m,k;
		getContentPane().setLayout(null);
		setBounds(0,0,215,320);
		JButton[] but=new JButton[16];
		for(i=0;i<but.length;i++)
		{
			but[i]=new JButton("");
			but[i].setBackground(Color.white);
			/*for(k=0;k<=210;k=k+70)
			{
				for(m=0;m<=150;m=m+50)
				{
					but[i].setBounds(m,k,50,70);
				}
			}*/
			getContentPane().add(but[i]);
		}
		but[0].setBounds(0,0,50,70);
		but[1].setBounds(50,0,50,70);
		but[2].setBounds(100,0,50,70);
		but[3].setBounds(150,0,50,70);
		but[4].setBounds(0,70,50,70);
		but[5].setBounds(50,70,50,70);
		but[6].setBounds(100,70,50,70);
		but[7].setBounds(150,70,50,70);
		but[8].setBounds(0,140,50,70);
		but[9].setBounds(50,140,50,70);
		but[10].setBounds(100,140,50,70);
		but[11].setBounds(150,140,50,70);
		but[12].setBounds(0,210,50,70);
		but[13].setBounds(50,210,50,70);
		but[14].setBounds(100,210,50,70);
		but[15].setBounds(150,210,50,70);
		int x,a,b,c,d;
		Random r=new Random();
		for(i=1;i<=4;i++)
		{
			int ri=r.nextInt(4);
			but[(i-1)*4+ri].setBackground(Color.black);
			x= (i-1)*4 + ri;
			a=12;
			b=13;
			d=14;
			if(x==a)
				a=15;
			else if(x==b)
				b=15;
			else if(x==c)
				c=15;
			}
			boolean flag=true;
		while(true)
		{
			
			but[x].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					seti(1);
				}
	
	but[a].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					seti(0);
				}
				but[b].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					seti(0);
				}
				but[c].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					seti(0);
				}
		}
		setLocation(170,50);
		setVisible(true);
	}
	public void seti(int h)
	{
		JOptionPane.showMessageDialog(null,""+h );
	me=h;
	}
}
			
