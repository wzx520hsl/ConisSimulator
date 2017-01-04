package pa1;



import java.util.Random;
import java.util.Scanner;

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */
public class CoinTossSimulator {
	private Random generator;
	private int twoTails;
	private int twoHeads;
	private int headTails;
	private int numTrials;
   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {
	   generator=new Random();
	   twoTails=0;
	   twoHeads=0;
	   headTails=0;
   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this
      without a reset() between them add these trials to the simulation
      already completed.
      
      @param numTrials  number of trials to for simulation; must be >= 0
    */
   public void run(int numTrials) {
	   	Scanner in =new Scanner(System.in);
	   while(numTrials<=0){
		   System.out.println("ERROR: Number entered must be greater than 0.");
		   System.out.print("Enter number of trials:");
		   numTrials=in.nextInt();
	   }
	   in.close();
	   for(int i=0;i<numTrials;i++){
		   int coin1=generator.nextInt(2);
		   int coin2=generator.nextInt(2);
		   if(coin1==0&&coin2==0){
			   twoTails++;
		   }else if(coin1==1&&coin2==1){
			   twoHeads++;
		   }else{
			   headTails++;
		   }
	   }
	   this.numTrials+=numTrials;
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
       return numTrials; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
       return twoHeads; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
       return twoTails; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return headTails; // DUMMY CODE TO GET IT TO COMPILE
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
	   twoTails=0;
	   twoHeads=0;
	   headTails=0;
	   numTrials=0;
   }

}