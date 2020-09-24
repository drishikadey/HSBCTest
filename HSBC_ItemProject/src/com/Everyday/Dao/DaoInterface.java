// AUTHOR <Drishika Dey>
// Purpose <Dao interface for security>

package com.Everyday.Dao;

import java.util.ArrayList;

import com.Everyday.Items.ApparelItems;
import com.Everyday.Items.ElectronicItems;
import com.Everyday.Items.FoodItems;

public interface DaoInterface {//interface to securely access dao class
	public int addApparel(ApparelItems a);
	public int addElectonic(ElectronicItems e);
	public int addFood(FoodItems f);

	public ArrayList<ApparelItems> viewApparel();
	public ArrayList<ElectronicItems> viewElectonic();
	public ArrayList<FoodItems> viewFood();

}
