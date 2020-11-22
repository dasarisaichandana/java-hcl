package com.mp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap hm=new LinkedHashMap();
		
		hm.put(12,"sk");
		hm.put(34,"kk");
		hm.put(56, "mk");
		
		hm.put(2,"tk");
		System.out.println(hm);
		
		System.out.println(hm.containsKey(34));
		System.out.println(hm.containsValue("kk"));
		
		System.out.println(hm.get(21));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
	
		
		
		
		
	}

}
