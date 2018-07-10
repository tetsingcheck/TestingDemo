package com.endurance.demo.model;

import java.util.Random;

public class Util {
	
	
	public Util()
	{
		
	}
	
	public String getRandomId(int length) {
        String CHARS = "1234567890";
        StringBuilder s = new StringBuilder();
        Random rnd = new Random();
        while (s.length() < length) { 
            int index = (int) (rnd.nextFloat() * CHARS.length());
            s.append(CHARS.charAt(index));
        }
        String str = s.toString();
        return str;

    }

}
