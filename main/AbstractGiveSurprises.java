package main;

import bag.*;
import surprise.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {

	private IBag bag;
	private int waitTime;

	public AbstractGiveSurprises(String typeOfBag, int waitTime) {
		this.waitTime = waitTime;
		BagFactoryOptimizeStorage bag = new BagFactoryOptimizeStorage();
		this.bag = bag.makeBag(typeOfBag);
	}

	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}

	public void put(IBag surprises) {
		this.bag.put(surprises);
	}

	public ISurprise give() {
		ISurprise surprise = this.bag.takeOut();
		surprise.enjoy();
		return surprise;
	}

	public ArrayList<ISurprise> giveAll() {
		ArrayList<ISurprise> surprises = new ArrayList<>(this.bag.size());

		int size = this.bag.size();
		
		for(int i = 0; i < size; i++) {
			ISurprise surprise = give();
			surprises.add(surprise);
			System.out.println();

			try {
				TimeUnit.SECONDS.sleep(this.waitTime);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		return surprises;
	}

	public boolean isEmpty() {
		return this.bag.isEmpty();
	}
	
	protected abstract void giveWithPassion();

}
