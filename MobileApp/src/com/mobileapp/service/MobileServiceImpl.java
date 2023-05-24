package com.mobileapp.service;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;

public class MobileServiceImpl implements MobileService{

	@Override
	public Mobile getById(int id) throws MobileNotFoundException {
		// TODO Auto-generated method stub
		Mobile[] mobiles=allMobiles();
		Mobile mobile1=new Mobile();
		int count=0;
		for(Mobile mobile:mobiles)
		{
			if(mobile.getMobileId()==id) {
				
				mobile1=mobile;
				count++;
			}
			
			
		}
		if(count==0)
			throw new MobileNotFoundException();
		
		return mobile1;
	}

	@Override
	public Mobile[] getAll() {
		// TODO Auto-generated method stub
		Mobile[] mobile=allMobiles();
		
		return mobile;
	}

	@Override
	public Mobile[] getByBrand(String brand) throws MobileNotFoundException {
		// TODO Auto-generated method stub
		Mobile[] mobile=allMobiles();
		int count=0;
		
		for(Mobile mobile1:mobile)
		{
			if(mobile1.getBrand().equals(brand))
			{
			
				count++;
			}
		}
			if(count==0)
			{
				throw new MobileNotFoundException();
			}
			Mobile[] mobiles=new Mobile[count];
			int i=0;
			for(Mobile mobile1:mobile)
			{
				if(mobile1.getBrand().equals(brand))
				{
					mobiles[i++]=mobile1;
				}
			}
				
		
		
		
		
		
		return mobiles;
	}
	
	
	
	private Mobile[] allMobiles() {
		
		Mobile[] mobiles=new Mobile[5];
		mobiles[0]=new Mobile("a11",12000,"samsung",1);
		mobiles[1]=new Mobile("note5",14000,"mi",2);
		mobiles[2]=new Mobile("note5",14000,"mi",2);
		mobiles[3]=new Mobile("note5",14000,"mi",2);
		mobiles[4]=new Mobile("note5",14000,"mi",2);
		return mobiles;
		
	}

}
