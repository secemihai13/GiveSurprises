package bag;

import java.util.ArrayList;
import surprise.*;


public class LIFOBag implements IBag{

	private ArrayList<ISurprise> bag;

	public LIFOBag() {
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
		ISurprise surprise = this.bag.get(this.bag.size() - 1);
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
