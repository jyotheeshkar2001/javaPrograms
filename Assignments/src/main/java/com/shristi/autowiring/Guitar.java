package com.shristi.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument{

	public void play(String song) {
		// TODO Auto-generated method stub
		System.out.println(song+" is played using guitar");
	}

}
