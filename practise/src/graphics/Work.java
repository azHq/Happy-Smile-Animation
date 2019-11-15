package graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Timer;
import javax.swing.*;
public class Work extends JPanel implements KeyListener,ActionListener{
	
	private  Timer timer;
	private int delay=5;
	
	private  int h=700;
	private  int k=600;
	private  int r=200;
	private  int r1=100,f=1;
	
	
	private int[] arr1;
	private int[] arr2;
	private int[] arr3;
	private int[] arr4;
	private int[] crr1;
	private int[] crr2;
	private int[] drr1;
	private int[] drr2;
	private int[] arr5;
	private int[] arr6;
	
	private int dirX=-1;
	private int dirY=-1;
	private boolean play=true;
	
	private int[] brr= {1,2,3,4,5};
	
	private int X,Y,n,e1,e2,e3,e4;
	
	
	public Work() {
		
		//addKeyListener(this);
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		
		timer=new Timer(delay,this);
		timer.start();
		arr1=new int[41];
		arr2=new int[41];
		arr3=new int[41];
		arr4=new int[41];
		crr1=new int[5];
		crr2=new int[5];
		
		drr1=new int[5];
		drr2=new int[5];
		
		arr5=new int[11];
		arr6=new int[11];
		
		
		X=h-r;

		for(int i=0;i<=40;i++) {
			//Random rand=new Random();
			//X=rand.nextInt(2*r);
			Y=(int)(Math.sqrt(Math.pow(r,2)-Math.pow((X-h),2))+k);
			arr1[i]=X;
			arr2[i]=Y;
			//System.out.println(X);
		
				X=X+10;
			
		}
		for(int i=0;i<=40;i++) {
			//Random rand=new Random();
			//X=rand.nextInt(800);
			
			arr3[i]=arr1[i];
			arr4[i]=k-Math.abs(k-arr2[i]);
			//Y=(int)(Math.sqrt(Math.pow(r,2)-Math.pow((X-h),2))+k);
			//arr3[i]=X;
			//arr4[i]=Y;
			//System.out.println(arr4[i]);
		}
		X=h-r1+20;
		for(int i=0;i<=8;i++) {
			//Random rand=new Random();
			//X=rand.nextInt(800);
			Y=(int)(Math.sqrt(Math.pow(r1,2)-Math.pow((X-h),2))+k);
			arr5[i]=X;
			arr6[i]=Y;
			X=X+20;
			
			//Y=(int)(Math.sqrt(Math.pow(r,2)-Math.pow((X-h),2))+k);
			//arr3[i]=X;
			//arr4[i]=Y;
			//System.out.println(arr4[i]);
		}
		
		crr1[0]=560;
		crr2[0]=540;
		crr1[1]=582;
		crr2[1]=525;
		crr1[2]=607;
		crr2[2]=505;
		crr1[3]=632;
		crr2[3]=525;
		crr1[4]=657;
		crr2[4]=540;
		 e1=607;
		 e2=570;
		 
		 e3=607+168;
		 e4=570;
		
		
		drr1[0]=crr1[0]+168;
		drr2[0]=545;
		drr1[1]=crr1[1]+168;
		drr2[1]=530;
		drr1[2]=crr1[2]+168;
		drr2[2]=510;
		drr1[3]=crr1[3]+168;
		drr2[3]=530;
		drr1[4]=crr1[4]+168;
		drr2[4]=545;
		
		
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.black);
		g.fillRect(1, 1,1700,1000);
		g.setColor(Color.red);
		g.fillRect(1, 1,10,1000);
		
		g.setColor(Color.red);
		g.fillRect(1, 1,1700,10);
		g.setColor(Color.red);
		g.fillRect(1685, 1,10,1000);
		g.setColor(Color.red);
		g.fillRect(1, 955,1700,10);
		
		g.setColor(Color.blue);
		g.setFont(new Font("serif",Font.BOLD,30));
		g.drawString("HAPPY  SMILE",600,40);
		g.drawString("CREATED BY MD.AZAZUL HAQUE",500,500);
		
		drawCircle(g);
		
		
		
	}
	
	public void drawCircle(Graphics g) {
		n=1;
		for(int i=0;i<=40;i++) {
			if(brr[0]==n) g.setColor(Color.blue);
			if(brr[1]==n) g.setColor(Color.green);
			if(brr[2]==n) g.setColor(Color.yellow);
			if(brr[3]==n) g.setColor(Color.red);
			if(brr[4]==n) g.setColor(Color.white);
			
			g.fillOval(arr1[i],arr2[i],20,20);
			//System.out.println("azaz"+arr1[i]+","+arr2[i]);
			if(n>=5) n=0;
			else n++;
		}
		
		n=1;
		for(int i=0;i<=40;i++) {
			
			if(brr[0]==n) g.setColor(Color.blue);
			if(brr[1]==n) g.setColor(Color.green);
			if(brr[2]==n) g.setColor(Color.yellow);
			if(brr[3]==n) g.setColor(Color.red);
			if(brr[4]==n) g.setColor(Color.white);
			
			g.fillOval(arr3[i],arr4[i],20,20);
			//System.out.println("azaz"+arr3[i]+","+arr4[i]);
			if(n>=5) n=0;
			else n++;
		}
		n=1;
		for(int i=0;i<=8;i++) {
			if(brr[0]==n) g.setColor(Color.blue);
			if(brr[1]==n) g.setColor(Color.green);
			if(brr[2]==n) g.setColor(Color.yellow);
			if(brr[3]==n) g.setColor(Color.red);
			if(brr[4]==n) g.setColor(Color.yellow);
			
			g.fillOval(arr5[i],arr6[i],20,20);
			//System.out.println("azaz"+arr1[i]+","+arr2[i]);
			if(n>=5) n=0;
			else n++;
		}
		
		
		for(int i=0;i<5;i++) {
			
			if(i==0) g.setColor(Color.blue);
			if(i==1) g.setColor(Color.green);
			if(i==2) g.setColor(Color.yellow);
			if(i==3) g.setColor(Color.red);
			if(i==4) g.setColor(Color.blue);
			
			g.fillOval(crr1[i],crr2[i],20,20);
			//System.out.println("azaz"+arr3[i]+","+arr4[i]);
			
		}
		for(int i=0;i<5;i++) {
			
			if(i==4) g.setColor(Color.blue);
			if(i==3) g.setColor(Color.green);
			if(i==2) g.setColor(Color.yellow);
			if(i==1) g.setColor(Color.red);
			if(i==0) g.setColor(Color.blue);
			
			g.fillOval(drr1[i],drr2[i],20,20);
			//System.out.println("azaz"+arr3[i]+","+arr4[i]);
			
		}
		g.setColor(Color.white);
		g.fillOval(e1,e2,20,20);
		g.setColor(Color.red);
		g.fillOval(e3,e4,20,20);
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int a,b;
		timer.start();
		if(play==true) {
			for(int i=0;i<=40;i++) {
				if(new Rectangle(1, 1,10,1000).intersects(new Rectangle(arr1[i],arr2[i],20,20))) {
					
					dirX=-dirX;
					//dirY=-dirY;
					
				}
				else if(new Rectangle(1, 1,1700,10).intersects(new Rectangle(arr1[i],arr2[i],20,20))) {
					
					//dirX=-dirX;
					dirY=-dirY;
					
				}
				else if(new Rectangle(1685, 1,10,1000).intersects(new Rectangle(arr1[i],arr2[i],20,20))) {
					
					dirX=-dirX;
					//dirY=-dirY;
					System.out.println("Bablu");
					
				}
				else if(new Rectangle(1, 955,1700,10).intersects(new Rectangle(arr1[i],arr2[i],20,20))) {
					
					//dirX=-dirX;
					dirY=-dirY;
					
				}
				
				
				
				else if(new Rectangle(1, 1,10,1000).intersects(new Rectangle(arr3[i],arr4[i],20,20))) {
					
					//dirX=-dirX;
					//dirY=-dirY;
					
				}
				else if(new Rectangle(1, 1,1700,10).intersects(new Rectangle(arr3[i],arr4[i],20,20))) {
					
					//dirX=-dirX;
					dirY=-dirY;
					
				}
				else if(new Rectangle(1685, 1,10,1000).intersects(new Rectangle(arr3[i],arr4[i],20,20))) {
					System.out.println("AZAZ");
					
					dirX=-dirX;
					//dirY=-dirY;
					
				}
				else if(new Rectangle(1, 955,1700,10).intersects(new Rectangle(arr3[i],arr4[i],20,20))) {
					
					//dirX=-dirX;
					dirY=-dirY;
					
				}
				
			}
			
			for(int i=0;i<=40;i++) {
				
				arr1[i]+=dirX;
				arr2[i]+=dirY;
				arr3[i]+=dirX;
				arr4[i]+=dirY;
				
			}
			for(int i=0;i<=8;i++) {
				
				arr5[i]+=dirX;
				arr6[i]+=dirY;
			}
			
			for(int i=0;i<5;i++) {
				
				crr1[i]+=dirX;
				crr2[i]+=dirY;
				
				drr1[i]+=dirX;
				drr2[i]+=dirY;
			}
			
			e1+=dirX;
			e2+=dirY;
			e3+=dirX;
			e4+=dirY;
			
			
			
			a=arr3[40];
			b=arr4[40];
			arr3[40]=arr1[0];
			arr4[40]=arr2[0];
			
			arr1[0]=a;
			arr2[0]=b;
			System.out.println("Azaz");
			for(int i=1;i<=40;i++) {
				
				a=arr3[40-i];
				b=arr4[40-i];
				
				arr3[40-i]=arr1[i];
				arr4[40-i]=arr2[i];
				
				arr1[i]=a;
				arr2[i]=b;
			}
			a=arr5[0];
			b=arr6[0];
			for(int i=1;i<=8;i++) {
				
				arr5[i-1]=arr5[i];
				arr6[i-1]=arr6[i];
						
			}
			
			arr5[8]=a;
			arr6[8]=b;
			
			a=e1;
			b=e2;
			e1=e3;
			e2=e4;
			e3=a;
			e4=b;
		}
		
		repaint();
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
		
			if(f==2) {
				play=true;
				f=1;
			}
			//System.out.println("BABLU");
			else {
				play=false;
				f=2;
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
