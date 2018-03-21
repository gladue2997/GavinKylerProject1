package application;


public class Dice {
	public int numberOfSides;
	public int currentSide;

	/**
	 * @param numberOfSides
	 * @param currentSide
	 */
	public Dice(int numberOfSides, int currentSide) {
		super();
		this.numberOfSides = numberOfSides;
		this.currentSide = currentSide;
	}

	/**
	 * @return the numberOfSides
	 */
	public int getNumberOfSides() {
		return numberOfSides;
	}

	/**
	 * @param numberOfSides
	 *            the numberOfSides to set
	 */
	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	/**
	 * @return the currentSide
	 */
	public int getCurrentSide() {
		return currentSide;
	}

	/**
	 * @param currentSide
	 *            the currentSide to set
	 */
	public void setCurrentSide(int currentSide) {
		this.currentSide = currentSide;
	}

	@Override
	public String toString() {
		return "Dice \n" + "Number of sides: " + this.numberOfSides + "\nCurrent side: " + this.currentSide;
	}

}
