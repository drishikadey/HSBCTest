package com.Everyday.Utility;

import com.Everyday.Business.BusinessClass;
import com.Everyday.Business.BusinessInterface;
import com.Everyday.Dao.DaoClass;
import com.Everyday.Dao.DaoInterface;

public class ServiceFactory {
	private ServiceFactory() {
		
	}
	
	public static DaoInterface createObject(String nn) {
		DaoInterface is=null;
		if(nn.equals("adminservice")) {
			is=new DaoClass();
		}
		return is;
	}
}
