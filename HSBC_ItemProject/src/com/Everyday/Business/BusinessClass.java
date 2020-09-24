package com.Everyday.Business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.Everyday.Dao.DaoInterface;
import com.Everyday.Items.ApparelItems;
import com.Everyday.Items.ElectronicItems;
import com.Everyday.Items.FoodItems;

import com.Everyday.Utility.ServiceFactory;

public class BusinessClass implements BusinessInterface {
	
	
	
private DaoInterface is;
	
	public BusinessClass() { //using service factory to securely create object of business class with interface ref
		//is=new InstagramService();
		is=ServiceFactory.createObject("adminservice");
	}
	//buffer
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	@Override
	public void addApparelBusiness()throws IOException {
		// TODO Auto-generated method stub
		
		//input Values
		System.out.println("----------Enter Item---------- ");
		System.out.println("Enter Item Code: ");
		int itemcode = Integer.parseInt(stdin.readLine());
		System.out.println("Enter Item Name: ");
		String name=stdin.readLine();
		System.out.println("Enter Quantity Sold: ");
		int quantity = Integer.parseInt(stdin.readLine());
		System.out.println("Enter Size: ");
		String size=stdin.readLine();
		System.out.println("Enter Material: ");
		String material=stdin.readLine();
		
		//set values
		ApparelItems a= new ApparelItems();
		a.setItemcode(itemcode);
		a.setName(name);
		a.setQuantity(quantity);
		a.setMaterial(material);
		a.setSize(size);
		
		// call dao to store in database(arraylist)
		int i = is.addApparel(a);
		
		if(i>0)
		{
			System.out.println("Entered ");
		}
		
		
		
	}

	@Override
	public void addElectonicBusiness()throws IOException {
		// TODO Auto-generated method stub
		//input Values
				System.out.println("----------Enter Item---------- ");
				System.out.println("Enter Item Code: ");
				int itemcode = Integer.parseInt(stdin.readLine());
				System.out.println("Enter Item Name: ");
				String name=stdin.readLine();
				System.out.println("Enter Quantity Sold: ");
				int quantity = Integer.parseInt(stdin.readLine());
				System.out.println("Enter warranty: ");
				int warranty = Integer.parseInt(stdin.readLine());
				
				//set values
				ElectronicItems a= new ElectronicItems();
				a.setItemcode(itemcode);
				a.setName(name);
				a.setQuantity(quantity);
				a.setWarranty(warranty);
				
				int i = is.addElectonic(a);//call to dao

				if(i>0)
				{
					System.out.println("Entered ");
				}
	}

	@Override
	public void addFoodBusiness() throws IOException{
		// TODO Auto-generated method stub
		//input Values
		System.out.println("----------Enter Item---------- ");
		System.out.println("Enter Item Code: ");
		int itemcode = Integer.parseInt(stdin.readLine());
		System.out.println("Enter Item Name: ");
		String name=stdin.readLine();
		System.out.println("Enter Quantity Sold: ");
		int quantity = Integer.parseInt(stdin.readLine());
		System.out.println("Enter veg: ");
		String veg = stdin.readLine();
		
		//set values
		FoodItems a= new FoodItems();
		a.setItemcode(itemcode);
		a.setName(name);
		a.setQuantity(quantity);
		a.setVeg(veg);
		
		int i = is.addFood(a);//call to dao

		if(i>0)
		{
			System.out.println("Entered ");
		}
		
	}

	@Override
	public ArrayList<ApparelItems> viewApparelBusiness() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ElectronicItems> viewElectonicBusiness() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<FoodItems> viewFoodBusiness() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
