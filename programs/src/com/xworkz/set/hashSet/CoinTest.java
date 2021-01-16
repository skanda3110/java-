package com.xworkz.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class CoinTest {
public static void main(String[] args) {
	HashSet<Coin> hs = new HashSet<Coin>();
	Coin coin1 = new Coin(1, 5.0, "Stainless Steel");
	Coin coin2 = new Coin(2, 7.0, "Stainless Steel");
	Coin coin3 = new Coin(5, 5.0, "nickel");
	Coin coin4 = new Coin(1, 5.0, "Stainless Steel");
	
	hs.add(coin1);
	hs.add(coin2);
	hs.add(coin3);
	hs.add(coin4);
	
	Iterator<Coin> itr = hs.iterator();
	
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
}
}
