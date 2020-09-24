package com.Everyday.Business;

import java.io.IOException;
import java.util.ArrayList;

import com.Everyday.Items.ApparelItems;
import com.Everyday.Items.ElectronicItems;
import com.Everyday.Items.FoodItems;

public interface BusinessInterface {
	public void addApparelBusiness() throws IOException;
	public void addElectonicBusiness()throws IOException;
	public void addFoodBusiness()throws IOException;

	public ArrayList<ApparelItems> viewApparelBusiness();
	public ArrayList<ElectronicItems> viewElectonicBusiness();
	public ArrayList<FoodItems> viewFoodBusiness();
}
