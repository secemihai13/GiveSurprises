package bag;

public class BagFactoryOptimizeStorage implements IBagFactory {

	@Override
	public IBag makeBag(String type) {
		
		IBag bag = null;
		
		switch (type) {
			case "RANDOM":
				bag = new RandomBag();
				break;
			case "FIFO":
				bag = new FIFOBag();
				break;
			case "LIFO":
				bag = new LIFOBag();
				break;
			default:
				System.out.println();
				break;
		}
		
		return bag;
	}

}
