package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class ShopingCart {

	public static void main(String[] args) {

		ShopingCartDTO dto1 = new ShopingCartDTO();
		dto1.setItemName("shoe");
		dto1.setPrice(1500.0);
		dto1.setNoOfItems(1);

		ShopingCartDTO dto2 = new ShopingCartDTO();
		dto2.setItemName("shirt");
		dto2.setPrice(800);
		dto2.setNoOfItems(1);

		Collection<ShopingCartDTO> dtos = new ArrayList<>();
		dtos.add(dto1);
		dtos.add(dto2);

		ShopingCartDTO dto3 = new ShopingCartDTO();
		dto3.setItemName("shoe");
		dto3.setPrice(1500);
		dto3.setNoOfItems(1);

		boolean contain = dtos.contains(dto3);
		if (contain) {
			System.out.println("shoe is present in cart");
		} else {
			System.out.println("adding shoe to cart");
			dtos.add(dto3);
		}
		System.out.println("No of items in cart is " + dtos.size());
	}
}
