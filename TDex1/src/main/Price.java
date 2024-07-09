package main;

public class Price {

	private static final int tva = 19;

	public float getTTCPrice(float pht) {
		
		return pht + (pht*tva)/100 ;
	}

}

