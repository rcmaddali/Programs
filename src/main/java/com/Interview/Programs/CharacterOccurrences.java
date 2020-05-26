package com.Interview.Programs;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = " ";
		System.out.println(countOccurrences(a));

	}
	
	public static String countOccurrences(String a) {
		
		Map<Character, Integer> countMap = new HashMap<Character,Integer>();
	
		
		if(a.length()<=0)
			return "String length is zero";
		else if(a.length()==1) {
			
			countMap.put(a.charAt(0),1);
			return countMap.toString();
		}
		else if (a.length()>1) {
			for(int i=0; i<=a.length()-1; i++) {
				
				if(countMap.containsKey(a.charAt(i))) {
					countMap.put(a.charAt(i), countMap.get(a.charAt(i))+1);
					
				}
				else
					countMap.put(a.charAt(i), 1);
			}
			return countMap.toString();
		}
		return null;
		
		
	}
	
	

}
