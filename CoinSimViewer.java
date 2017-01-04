package pa1;


import javax.swing.JFrame;
public class CoinSimViewer {
	public static void main(String[] args){
		JFrame frame=new JFrame();
		
		frame.setSize(1000, 600);
		frame.setTitle("CoinSim");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 CoinSimComponent componet=new CoinSimComponent();
		 
		 frame.add(componet);
		 frame.setVisible(true);
		
	}
}
