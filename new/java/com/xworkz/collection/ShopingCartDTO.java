package com.xworkz.collection;

public class ShopingCartDTO {

	private String itemName;
	private double price;
	private int noOfItems;

	public ShopingCartDTO() {
		super();
	}

	@Override
	public String toString() {
		return "ShopingCartDTO [itemName=" + itemName + ", price=" + price + ", noOfItems=" + noOfItems + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof ShopingCartDTO) {

			if (((ShopingCartDTO) obj).itemName.equals(this.itemName)) {
				System.out.println("item name " + this.itemName + " is already present");
				return true;
			}

		}
		return false;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

}
