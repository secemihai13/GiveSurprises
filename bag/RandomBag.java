package bag;

import java.util.ArrayList;

import main.IRandom;
import surprise.*;


public class RandomBag implements IBag, IRandom {

	private ArrayList<ISurprise> bag;

	public RandomBag() {
		this.bag = new ArrayList<ISurprise>();
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.bag.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		for(int i = 0; i < bagOfSurprises.size(); i++) {
			this.bag.add(bagOfSurprises.get(i));
		}
	}

	@Override
	public ISurprise takeOut() {
		ISurprise surprise = this.bag.get(random.nextInt(this.bag.size()));
		this.bag.remove(surprise);
		
		return surprise;
	}

	@Override
	public boolean isEmpty() {
		return this.bag.size() == 0;
	}

	@Override
	public int size() {
		return this.bag.size();
	}
	
	@Override
	public ISurprise get(int index) {
		return this.bag.get(index);
	}

}
