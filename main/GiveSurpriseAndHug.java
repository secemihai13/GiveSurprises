package main;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

	public GiveSurpriseAndHug(String typeOfBag, int waitTime) {
		super(typeOfBag, waitTime);
	}

	@Override
	protected void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
		give();
	}

}
