package com.Everyday.View;

import java.io.IOException;

import com.Everyday.Business.BusinessClass;
import com.Everyday.Business.BusinessInterface;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object of business interface to call
		BusinessInterface bi = new BusinessClass();
	
		//catches the exceptions thrown before
		try {
			bi.addApparelBusiness();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bi.addApparelBusiness();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			bi.addFoodBusiness();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bi.viewApparelBusiness();
		bi.viewElectonicBusiness();
		bi.viewFoodBusiness();
	}

}
