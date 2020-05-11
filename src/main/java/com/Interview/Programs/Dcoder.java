package com.Interview.Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dcoder {

	public static void main(String args[])
	   { 
	    String a = "Hello";
	    System.out.println(checkDup(a));
	   }
	   
	   public static Character checkDup(String a){
	     Set<Character> hs = new LinkedHashSet<Character>();
	      for(int i=0; i<=a.length()-1;i++){
	        hs.add(a.charAt(i));
	      }
	      return hs.iterator().next();
	   }
}
