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
		
		createDice(6);
		createDice(5);
		
		removeDice(diceList.get(0));
		
		/*
		removeDice(diceList.get(1));
		removeDice(diceList.get(2));
		removeDice(diceList.get(3));
		removeDice(diceList.get(4));
		removeDice(diceList.get(5));
		removeDice(diceList.get(6));
		removeDice(diceList.get(7));
		removeDice(diceList.get(8));
		*/
		
		System.out.println(diceList);
 
	}

	public void createDice(int userSideSelection) {
		int sides = userSideSelection;

		Dice d = new Dice(sides, 1);

		diceList.add(d);
	}

	public void removeDice(Dice d) {
		diceList.remove(d);
	}

}
