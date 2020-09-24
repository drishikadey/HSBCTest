
// AUTHOR <Drishika Dey>
// Purpose <Entity class for Electronic Items>
package com.Everyday.Items;

public class ElectronicItems 
//Entity class 
{
private int itemcode;
private String name;
private int UPrice;
private int Warranty;
private int Quantity;
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
public int getUPrice() {
	return UPrice;
}
public void setUPrice(int uPrice) {
	UPrice = uPrice;
}
public int getWarranty() {
	return Warranty;
}
public void setWarranty(int warranty) {
	Warranty = warranty;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}

}
