import java.util.Random;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;



public class Jframedemo1 extends JFrame
{
	static int me,a,b,c,x,count=0;
	public static int arr[]=new int[4];
	public static JFrame j= new JFrame("first");
	private static JButton[] but=new JButton[16];
	public static void main(String args[])
	{
		//JFrame j= new JFrame("first");
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
			j.getContentPane().add(but[i]);
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
		int x=0,a=0,b=0,c=0,d=0;
		Random r=new Random();
		for(i=1;i<=4;i++)
		{
			int ri=r.nextInt(4);
			arr[i-1]=ri;
			but[(i-1)*4+ri].setBackground(Color.black);
			x= (i-1)*4 + ri;
			a=12;
			b=13;
			c=14;
			if(x==a)
				a=15;
			else if(x==b)
				b=15;
			else if(x==c)
				c=15;
			}
			boolean flag=true;
		j.setLocation(170,50);
		j.setVisible(true);
		//while(me==1)
		//{
			//JOptionPane.showMessageDialog(null,"fsdf" );
			/*but[x].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//JOptionPane.showMessageDialog(null,"jo" );
					next();
				}});
	
	but[a].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null,"jo" );
				}
				});
				but[b].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null,"jo" );
				}});
				but[c].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null,"jo" );
				}});
		//}*/
		//while(true)
		//{
			but[12].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//JOptionPane.showMessageDialog(null,"" );
					//next();
					if(but[12].getBackground()==Color.black)
					{
						int i,k;
					for(i=3;i>=1;i--)
					{
						for(k=0;k<=3;k++)
						{
							but[(i*4)+k].setBackground(but[((i-1)*4)+k].getBackground());
						}
						arr[i]=arr[i-1];
					}
					if(arr[3]==0)
					{
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
						set(13,14,15,12);
						/*x=12;
						a=13;
						b=14;
						c=15;*/
				//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else if(arr[3]==1)
					{
						/*x=13;
						a=12;
						b=14;
						c=15;*/
						set(12,14,15,13);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else if(arr[3]==2)
					{
						/*x=14;
						a=12;
						b=13;
						c=15;*/
						set(12,13,15,14);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else
					{
						/*x=15;
						a=12;
						b=14;
						c=13;*/
						set(12,13,14,15);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					Random r=new Random();
					int ri=r.nextInt(4);
					arr[0]=ri;
					but[0].setBackground(Color.white);
					but[1].setBackground(Color.white);
					but[2].setBackground(Color.white);
					but[3].setBackground(Color.white);
					but[ri].setBackground(Color.black);
					count++;
					}
					
					else
					{JOptionPane.showMessageDialog(null,"Score is "+count );
					j.dispose();}
					
				}});
	
				but[13].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(but[13].getBackground()==Color.black)
					{
						int i,k;
						count++;
					for(i=3;i>=1;i--)
					{
						for(k=0;k<=3;k++)
						{
							but[(i*4)+k].setBackground(but[((i-1)*4)+k].getBackground());
						}
						arr[i]=arr[i-1];
					}
					if(arr[3]==0)
					{
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
						set(13,14,15,12);
						/*x=12;
						a=13;
						b=14;
						c=15;*/
				//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else if(arr[3]==1)
					{
						/*x=13;
						a=12;
						b=14;
						c=15;*/
						set(12,14,15,13);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else if(arr[3]==2)
					{
						/*x=14;
						a=12;
						b=13;
						c=15;*/
						set(12,13,15,14);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else
					{
						/*x=15;
						a=12;
						b=14;
						c=13;*/
						set(12,13,14,15);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					Random r=new Random();
					int ri=r.nextInt(4);
					arr[0]=ri;
					but[0].setBackground(Color.white);
					but[1].setBackground(Color.white);
					but[2].setBackground(Color.white);
					but[3].setBackground(Color.white);
					but[ri].setBackground(Color.black);
					}
					
					else
					{JOptionPane.showMessageDialog(null,"Score is "+count );
					j.dispose();}
				}
				});
				but[14].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(but[14].getBackground()==Color.black)
					{
						int i,k;
						count++;
					for(i=3;i>=1;i--)
					{
						for(k=0;k<=3;k++)
						{
							but[(i*4)+k].setBackground(but[((i-1)*4)+k].getBackground());
						}
						arr[i]=arr[i-1];
					}
					if(arr[3]==0)
					{
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
						set(13,14,15,12);
						/*x=12;
						a=13;
						b=14;
						c=15;*/
				//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else if(arr[3]==1)
					{
						/*x=13;
						a=12;
						b=14;
						c=15;*/
						set(12,14,15,13);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else if(arr[3]==2)
					{
						/*x=14;
						a=12;
						b=13;
						c=15;*/
						set(12,13,15,14);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else
					{
						/*x=15;
						a=12;
						b=14;
						c=13;*/
						set(12,13,14,15);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					Random r=new Random();
					int ri=r.nextInt(4);
					arr[0]=ri;
					but[0].setBackground(Color.white);
					but[1].setBackground(Color.white);
					but[2].setBackground(Color.white);
					but[3].setBackground(Color.white);
					but[ri].setBackground(Color.black);
					}
					
					else
					{JOptionPane.showMessageDialog(null,"Score is "+count );
					j.dispose();}
				}});
				but[15].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(but[15].getBackground()==Color.black)
					{
						int i,k;
						count++;
					for(i=3;i>=1;i--)
					{
						for(k=0;k<=3;k++)
						{
							but[(i*4)+k].setBackground(but[((i-1)*4)+k].getBackground());
						}
						arr[i]=arr[i-1];
					}
					if(arr[3]==0)
					{
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
						set(13,14,15,12);
						/*x=12;
						a=13;
						b=14;
						c=15;*/
				//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else if(arr[3]==1)
					{
						/*x=13;
						a=12;
						b=14;
						c=15;*/
						set(12,14,15,13);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else if(arr[3]==2)
					{
						/*x=14;
						a=12;
						b=13;
						c=15;*/
						set(12,13,15,14);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					else
					{
						/*x=15;
						a=12;
						b=14;
						c=13;*/
						set(12,13,14,15);
						//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
					}
					Random r=new Random();
					int ri=r.nextInt(4);
					arr[0]=ri;
					but[0].setBackground(Color.white);
					but[1].setBackground(Color.white);
					but[2].setBackground(Color.white);
					but[3].setBackground(Color.white);
					but[ri].setBackground(Color.black);
					}
					
					else
					{JOptionPane.showMessageDialog(null,"Score is "+count);
					j.dispose();}
				}});
			
		
		
			/*for(i=3;i>=1;i--)
			{
				for(k=0;k<=3;k++)
				{
					but[(i*4)+k].setBackground(but[((i-1)*4)+k].getBackground());
				}
				arr[i]=arr[i-1];
			}
			if(arr[3]==0)
			{
				//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
				x=12;
				a=13;
				b=14;
				c=15;
				JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
			}
			else if(arr[3]==1)
			{
				x=13;
				a=12;
				b=14;
				c=15;
				JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
			}
			else if(arr[3]==2)
			{
				x=14;
				a=12;
				b=13;
				c=15;
				JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
			}
			else
			{
				x=15;
				a=12;
				b=14;
				c=13;
				JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
			}
			int ri=r.nextInt(4);
			arr[0]=ri;
			but[0].setBackground(Color.white);
			but[1].setBackground(Color.white);
			but[2].setBackground(Color.white);
			but[3].setBackground(Color.white);
			but[ri].setBackground(Color.black);*/
			
		//}
	}
	/*public static void seti(int h)
	{
		//JOptionPane.showMessageDialog(null,""+h );
	me=h;
	}
	public static void next()
	{
		int i,k;
		
		
			for(i=3;i>=1;i--)
			{
				for(k=0;k<=3;k++)
				{
					but[(i*4)+k].setBackground(but[((i-1)*4)+k].getBackground());
				}
				arr[i]=arr[i-1];
			}
			if(arr[3]==0)
			{
				//JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
				x=12;
				a=13;
				b=14;
				c=15;
				JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
			}
			else if(arr[3]==1)
			{
				x=13;
				a=12;
				b=14;
				c=15;
				JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
			}
			else if(arr[3]==2)
			{
				x=14;
				a=12;
				b=13;
				c=15;
				JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
			}
			else
			{
				x=15;
				a=12;
				b=14;
				c=13;
				JOptionPane.showMessageDialog(null,"" +x+" "+a+" "+b+" "+c);
			}
			Random r=new Random();
			int ri=r.nextInt(4);
			arr[0]=ri;
			but[0].setBackground(Color.white);
			but[1].setBackground(Color.white);
			but[2].setBackground(Color.white);
			but[3].setBackground(Color.white);
			but[ri].setBackground(Color.black);
			actionCheck();
		
		
	}
	
	public static void actionCheck()
	{
		but[x].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//JOptionPane.showMessageDialog(null,"" );
					next();
				}});
	
		but[a].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null,"END" );
					j.dispose();
				}
				});
				but[b].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null,"END" );
					j.dispose();
				}});
				but[c].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null,"END" );
					j.dispose();
				}});
	}*/
	public static void set(int a1,int b1,int c1,int x1)
	{
		a=a1;
		b=b1;
		c=c1;
		x=x1;
	}
}
			
