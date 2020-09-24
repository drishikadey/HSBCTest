// AUTHOR <Drishika Dey>
// Purpose <Entity class for Food Items>

package com.Everyday.Items;

public class FoodItems {
	private int itemcode;
	private String name;
	private int Quantity;
	private String Veg;
	public int getItemcode() {
		return itemcode;
	}
	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getVeg() {
		return Veg;
	}
	public void setVeg(String veg) {
		Veg = veg;
	}

}
