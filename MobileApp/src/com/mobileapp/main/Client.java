package com.mobileapp.main;
import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;
import com.mobileapp.service.MobileService;
import com.mobileapp.service.MobileServiceImpl;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileService ms=new MobileServiceImpl();
		Mobile[] mobiles=ms.getAll();
		for(Mobile mobile:mobiles)
		{
			System.out.println(mobile);
		}
		System.out.println("by id......");
		
		try {
			System.out.println(ms.getById(4));
		} catch (MobileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("by brand....");
		
		Mobile[] mobiles1;
		try {
			mobiles1 = ms.getByBrand("samsung");
			for(Mobile mobile:mobiles1)
			{
				System.out.println(mobile);
			}
		} catch (MobileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
