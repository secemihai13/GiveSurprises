package surprise;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {

	private String name;
	private static int counter = 0;
	private static String[] list = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};

	public MinionToy(String name) {
		this.name = name;
	}

	@Override
	public void enjoy() {
		System.out.println("Felicitari! Ai primit cadou un minion pe nume " + this.name + ". \nBucura-te de el!");
	}

	public static MinionToy generate() {
		if(counter == 6) {
			counter = 0;
		}
		return new MinionToy(list[counter++]);
	}

}
