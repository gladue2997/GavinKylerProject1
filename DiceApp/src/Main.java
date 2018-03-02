import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		actualDice d = new actualDice();
		d.startRolling();

	}

}

class actualDice {
	ArrayList<Dice> diceList = new ArrayList<Dice>();

	Scanner sc = new Scanner(System.in);

	public void startRolling() {

	}

	public void createDice(int userSideSelection) {
		int sides = userSideSelection;

		Dice d = new Dice(sides, 1);

		diceList.add(d);
	}

	public void removeDice(Dice d) {
		
	}
	
	

}
