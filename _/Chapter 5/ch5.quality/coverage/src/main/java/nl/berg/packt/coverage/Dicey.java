package nl.berg.packt.coverage;
import java.util.Random;

public class Dicey {
	private Random generator;

	public Dicey(){
		this.generator = new Random();
		throwDice();
	}
	
	private int throwDice() {
		int value = generator.nextInt(6) + 1;
		if (value > 3){
			System.out.println("Dice > 3");
		}else{
			System.out.println("Dice < 4");
		}
		return value;
	}
}
