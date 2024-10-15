package org.coin;

import java.util.Random;

public class CoinFlip {
	public static void main(String[]args) {
		Random r=new Random();
		
		Boolean flipResult = r.nextBoolean();
		
		if(flipResult) {
			System.out.println("Heads");
		}
		else {
			System.out.println("Tails");
		}
	}
}
