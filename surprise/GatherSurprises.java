package surprise;

import java.util.ArrayList;

import main.IRandom;

public final class GatherSurprises implements IRandom {
	
	private static ArrayList<ISurprise> listOfSurprises = new ArrayList<>();

	private GatherSurprises() {
	}

	public static ArrayList<ISurprise> gather(int n) {
		listOfSurprises.clear();
		listOfSurprises.trimToSize();
		
		for(int i = 0; i < n; i++) {
			listOfSurprises.add(gather());
		}
		return listOfSurprises;
	}
	
	public static ISurprise gather() {
		
		ISurprise surprise = null;
		switch (random.nextInt(3)) {
			case 0:
				surprise = FortuneCookie.generate();
				break;
			case 1:
				surprise = Candies.generate();
				break;
			case 2:
				surprise = MinionToy.generate();
				break;
			default:
				break;
		}
		return surprise;	
	}

}
