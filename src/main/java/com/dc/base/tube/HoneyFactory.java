package com.dc.base.tube;

import java.util.Random;

public class HoneyFactory {

	private final static String[] HONEY_BOX = {
		"I just called to say I love you",
		"That is the way we are",
		"Wake me up when spring comes"
	};
	
	public static String getHoney(){
		Random r = new Random();
		return HONEY_BOX[r.nextInt(HONEY_BOX.length)];
	}
}
