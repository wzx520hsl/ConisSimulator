package pa1;



import java.util.Random;

public class CoinTossSimulatorTestor {
	public static void main(String[] args){
		Random generator=new Random();
		CoinTossSimulator simulator=new CoinTossSimulator();
		System.out.println("After constructor");
		System.out.println("Number of trails: "+simulator.getNumTrials());
		System.out.println("Two-head tosses: "+simulator.getTwoHeads());
		System.out.println("Two-tail tosses: "+simulator.getTwoTails());
		System.out.println("One-head One-tail tosses: "+simulator.getHeadTails());
		System.out.println("Tosses add up correctly? "+(simulator.getNumTrials()==simulator.getHeadTails()+simulator.getTwoHeads()+simulator.getTwoTails()));
		System.out.println("");
		for(int i=0;i<5;i++){
			int num=generator.nextInt(20);
			simulator.run(num);
			System.out.println("After run("+num+")");
			System.out.println("Number of trails: "+simulator.getNumTrials());
			System.out.println("Two-head tosses: "+simulator.getTwoHeads());
			System.out.println("Two-tail tosses: "+simulator.getTwoTails());
			System.out.println("One-head One-tail tosses: "+simulator.getHeadTails());
			System.out.println("Tosses add up correctly? "+(simulator.getNumTrials()==simulator.getHeadTails()+simulator.getTwoHeads()+simulator.getTwoTails()));
			System.out.println("");
		}
		
		simulator.reset();
		System.out.println("After constructor");
		System.out.println("Number of trails: "+simulator.getNumTrials());
		System.out.println("Two-head tosses: "+simulator.getTwoHeads());
		System.out.println("Two-tail tosses: "+simulator.getTwoTails());
		System.out.println("One-head One-tail tosses: "+simulator.getHeadTails());
		System.out.println("Tosses add up correctly? "+(simulator.getNumTrials()==simulator.getHeadTails()+simulator.getTwoHeads()+simulator.getTwoTails()));
		System.out.println("");
		
		for(int i=0;i<5;i++){
			int num=generator.nextInt(1000);
			simulator.run(num);
			System.out.println("After run("+num+")");
			System.out.println("Number of trails: "+simulator.getNumTrials());
			System.out.println("Two-head tosses: "+simulator.getTwoHeads());
			System.out.println("Two-tail tosses: "+simulator.getTwoTails());
			System.out.println("One-head One-tail tosses: "+simulator.getHeadTails());
			System.out.println("Tosses add up correctly? "+(simulator.getNumTrials()==simulator.getHeadTails()+simulator.getTwoHeads()+simulator.getTwoTails()));
			System.out.println("");
		}
	}
}
