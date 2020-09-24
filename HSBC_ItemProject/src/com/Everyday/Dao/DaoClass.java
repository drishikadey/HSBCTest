// AUTHOR <Drishika Dey>
// Purpose <DAO class for Data Access>
package com.Everyday.Dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.Everyday.Items.ApparelItems;
import com.Everyday.Items.ElectronicItems;
import com.Everyday.Items.FoodItems;

public class DaoClass implements DaoInterface{
//implementing dao interface functions in dao class
	
	//DATA STORAGE
	private ArrayList<ApparelItems> arrA= null;
	private ArrayList<ElectronicItems> arrE= null;
	private ArrayList<FoodItems> arrF= null;
	
	
	public DaoClass() // constructor to initialize values
	{
		arrA= new ArrayList<ApparelItems> ();
		arrE= new ArrayList<ElectronicItems> ();
		arrF= new ArrayList<FoodItems> ();
	}
	
	
	@Override
	public int addApparel(ApparelItems a) {
		arrA.add(a); 
		return 1;//adds apparel item to list
	}

	@Override
	public int addElectonic(ElectronicItems e) {
		// TODO Auto-generated method stub
		arrE.add(e);// adds electronic item
		return 1;
	}

	@Override
	public int addFood(FoodItems f) {
		// TODO Auto-generated method stub
		arrF.add(f);//adds food item
		return 1;
	}

	@Override
	public ArrayList<ApparelItems> viewApparel() {
		// TODO Auto-generated method stub
		 Collections.sort(arrA, new Comparator<ApparelItems>() 
		 {
		        @Override public int compare(ApparelItems p1, ApparelItems p2) {
		            return p1.getQuantity()-p2.getQuantity();
		    }});
		 // sort by quantity for display
		 
		 return arrA;
	}

	@Override
	public ArrayList<ElectronicItems> viewElectonic() {
		 Collections.sort(arrE, new Comparator<ElectronicItems>() 
		 {
		        @Override public int compare(ElectronicItems p1,ElectronicItems p2) {
		            return p1.getQuantity()-p2.getQuantity();
		    }});
		 // sort by quantity for display
		 
		 return arrE;
		
	}

	@Override
	public ArrayList<FoodItems> viewFood() {
		 Collections.sort(arrF, new Comparator<FoodItems>() 
		 {
		        @Override public int compare(FoodItems p1, FoodItems p2) {
		            return p1.getQuantity()-p2.getQuantity();
		    }});
		 // sort by quantity for display
		 
		 return arrF;
		
	}

}
