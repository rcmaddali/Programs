//WAP to find the first duplicate occurrence in an Array

package com.Interview.Programs;

import java.util.HashMap;
import java.util.Map;


public class FirstOccurenceinArray {

	public static void main (String[] args) {
		//System.out.println("Hello Java");
    String a = "aabbacccdeeff";
    System.out.println(char_counts(a));
	}
  
  public static Character char_counts(String s){  
    Map<Character, Integer> counts = new HashMap<Character, Integer>();
    
    for(int i =0; i<=s.length()-1; i++){
      char c  = s.charAt(i);
      if(counts.containsKey(c))
      counts.put(c, counts.get(c)+1);
      else{
        counts.put(c, 1);
        
      }
    }
    
    for(int i=0; i<=s.length()-1; i++){
      char c  = s.charAt(i);
        if(counts.get(c) == 1)
        return c;
      }
      
  
  return '_';
    
  }

}