package main;

import bag.*;
import surprise.*;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {

		//		BagFactoryOptimizeStorage bagFactory = new BagFactoryOptimizeStorage();
		//		
		//		IBag randomBag = bagFactory.makeBag("RANDOM");
		//		IBag fifoBag = bagFactory.makeBag("FIFO");
		//		IBag lifoBag = bagFactory.makeBag("LIFO");
		//		
		//		System.out.println(randomBag instanceof RandomBag);
		//		System.out.println(fifoBag instanceof FIFOBag);
		//		System.out.println(lifoBag instanceof LIFOBag);
		//		
		//		GiveSurpriseAndApplause applause = new GiveSurpriseAndApplause("RANDOM", 5);
		//		
		//		for(int i = 0; i < 50; i++) {
		//			applause.put(GatherSurprises.gather());
		//		}
		//		
		//		applause.giveWithPassion();

		//		BagFactoryOptimizeStorage bagFactory = new BagFactoryOptimizeStorage();
		//		BagFactoryOptimizeStorage bagFactory2 = new BagFactoryOptimizeStorage();
		//		
		//		IBag fifoBag = bagFactory.makeBag("FIFO");
		//		IBag randomBag = bagFactory.makeBag("RANDOM");
		//		
		//		for(int i = 0; i < 5; i++) {
		//			fifoBag.put(GatherSurprises.gather());
		//		}

		//		for(int i = 0; i < 2; i++) {
		//			randomBag.put(GatherSurprises.gather());
		//		}

		//		System.out.println(fifoBag.size());

		//		int size = fifoBag.size();
		//		for(int i = 0; i < size; i++) {
		//			fifoBag.takeOut().enjoy();
		//			System.out.println();
		//		}
		//		
		//		fifoBag.put(randomBag);

		//		
		//		for(int i = 0; i < fifoBag.size(); i++) {
		//			fifoBag.get(i).enjoy();
		//			System.out.println();
		//		}

		GiveSurpriseAndHug hug = new GiveSurpriseAndHug("LIFO", 1);

		for(int i = 0; i < 20; i++) {
			hug.put(GatherSurprises.gather());
		}

		hug.giveAll();

	}

}

