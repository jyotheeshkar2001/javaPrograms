package com.shristi.auto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class FoodFactory {
	
	@Autowired
	IFoodMenu chinese;
	
	@Autowired
	IFoodMenu indian;
	
	@Autowired
	IFoodMenu continental;
	
	public List<String> displayMenu(String choice){
		List<String> items=null;
		if(choice.equals("chinese"))
			items=chinese.showItems();
		if(choice.equals("indian"))
			items=chinese.showItems();
		if(choice.equals("continental"))
			items=chinese.showItems();
		return items;
	}


}
