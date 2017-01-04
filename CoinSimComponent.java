package pa1;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Scanner;

import javax.swing.JComponent;

public class CoinSimComponent extends JComponent {
	int a;
	int b;
	int c;
	int d;
	public CoinSimComponent(){
		CoinTossSimulator simulator=new CoinTossSimulator();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of trials: ");
		int x=in.nextInt();
		simulator.run(x);
		a=simulator.getTwoHeads();
		b=simulator.getHeadTails();
		c=simulator.getTwoTails();
		d=simulator.getNumTrials();
	}
	public void paintComponent(Graphics g){

		Graphics2D g2=(Graphics2D) g;

		Bar bar1=new Bar((int)this.getHeight()/10*9,(int)this.getWidth()/7,(int)this.getWidth()/7,a,(double)this.getHeight()/(double)d,Color.RED,"Two Heads: "+a+"("+a*100/(double)d+"%)");
		bar1.draw(g2);
	
		Bar bar2=new Bar((int)this.getHeight()/10*9,(int)this.getWidth()/7*3,(int)this.getWidth()/7,b,(double)this.getHeight()/(double)d,Color.GREEN,"A Head and A tail: "+b+"("+b*100/(double)d+"%)");
		bar2.draw(g2);
		
		Bar bar3=new Bar((int)this.getHeight()/10*9,(int)this.getWidth()/7*5,(int)this.getWidth()/7,c,(double)this.getHeight()/(double)d,Color.BLUE,"Two Tails: "+c+"("+c*100/(double)d+"%)");
		bar3.draw(g2);
	
	}
}
