import java.util.Random;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

/*class f extends JFrame implements ActionListener
{
	public JFrame j=new JFrame("First frame");
	public JButton[] but=new JButton[16];
		public void actionPerformed(ActionEvent e)
		{
			
		}
		public f()
		{
			j.addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			}
			);
			int i,m,k;
			j.getContentPane().setLayout(null);
			j.setBounds(0,0,215,320);
			//JButton[] but=new JButton[16];
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
				/*j.getContentPane().add(but[i]);
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
			
			Random r=new Random();
			for(i=1;i<=4;i++)
			{
				int ri=r.nextInt(4);
				but[(i-1)*4+ri].setBackground(Color.black);
			}
			while(true)
			{
				but[12].addActionListener(this);
				but[13].addActionListener(this);
				but[14].addActionListener(this);
				but[15].addActionListener(this);
			}
			j.setLocation(170,50);
			j.setVisible(true);
		}
		
		
		
		
}
*/

public class Jframedemo extends JFrame implements WindowListener, ActionListener
{
	boolean flag=true;
	int me;
	public static void main(String args[])
	{
		Jframedemo j= new Jframedemo("first");
		j.setLocation(170,50);
		j.setVisible(true);
		
	}
	public Jframedemo(String title)
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
		int i,m,k,x;
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
		final JButton b=new JButton("");
		Random r=new Random();
		int a,b,c;
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
		/*ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        Color background = b.getBackground();
		//JOptionPane.showMessageDialog(null, "hiii");
        if (background == Color.black) {
          JOptionPane.showMessageDialog(null, "hiiibbb");
		  seti(0);
        }
		else
		{
			JOptionPane.showMessageDialog(null, "hiiiwwwwww");
			seti(1);
		}
      }
    };*/
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
	//b.setBackground(but[x].getBackground());
    //but[12].addActionListener(actionListener);
	//b.setBackground(but[13].getBackground());
	//but[13].addActionListener(actionListener);
	//b.setBackground(but[14].getBackground());
	//but[14].addActionListener(actionListener);
	//b.setBackground(but[15].getBackground());
	//but[15].addActionListener(actionListener);



		
		/*while(flag)
		{
			
			for(i=12;i<=15;i++)
			{
				but[i].setText(""+i);
				but[i].addActionListener(this);
				if(me==0)
				{
					flag=false;
				}
				else
				{
					but=nextStep(but);
				}
				/*public void actionPerformed(ActionEvent e,int i) {
					
						if(but[i].getBackground()==Color.black)
						{
							for(i=3;i>=1;i--)
							{
								for(k=0;k<=3;k++)
								{
									but[(i*4+k)].setBackground(but[(i*3+k)].getBackground);
								}
							}
						}
						else
						{
							this.flag=false;
						}
					
				}
			});*/
			/*}
		}*/
	}
	public void seti(int h)
	{
		JOptionPane.showMessageDialog(null, ""+h);
	me=h;
	}
	
	public void actionPerformed(ActionEvent e) {
                //numClicks++;
                //text.setText("Button Clicked " + numClicks + " times");
				if(getBackground()==Color.black)
					{
						seti(0);
						//Jframedemo.this.setText("dddd");
						//Jframedemo.this.setBackground(Color.black);
						//Jframedemo.this.flag=false;
					}
					else if(Jframedemo.this.getBackground()!=Color.black)
						seti(1);
        }

	public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }
	public JButton[] nextStep(JButton but[])
	{
		int i,k;
		for(i=3;i>=1;i--)
		{
			for(k=0;k<=3;k++)
			{
				but[(i*4+k)].setBackground(but[(i*3+k)].getBackground());
			}
		}
		return but;
	}
	public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}
}
			
