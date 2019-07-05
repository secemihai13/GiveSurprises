
package surprise;

import main.IRandom;

public class Candies implements ISurprise, IRandom {

	private int noCandies;
	private String candiesType;
	private static String[] list = {"chocolate", "jelly", "fruits", "vanilla"};

	public Candies(int noCandies, String candiesType) {
		this.noCandies = noCandies;
		this.candiesType = candiesType;
	}

	@Override
	public void enjoy() {
		if(this.noCandies > 1) {
			System.out.println("Bucura-te de gustul minunat al bomboanelor!!! \nAi primit " + this.noCandies + " si sunt de tipul " + this.candiesType + ".");
		} else if(this.noCandies == 1) {
			System.out.println("Bucura-te de gustul minunat al bomboanei de tipul " + this.candiesType + ".");
		} else {
			System.out.println("Nicio bomboana pentru tine... Sorry, mate!\nPoate la anu' ai mai mult bulan!");
		}
	}

	public static Candies generate() {
		
		return new Candies(random.nextInt(51), list[random.nextInt(4)]);
	}

}
