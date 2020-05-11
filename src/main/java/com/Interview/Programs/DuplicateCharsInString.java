package com.Interview.Programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		
		String a = "abcdabd";
		System.out.println(dupChars(a));
		
	}

	@SuppressWarnings("null")
	public static char dupChars(String s) {
		
		char [] ch = s.toCharArray();
		Set<Character> hs = new HashSet<Character>();
		
		for(int i=0; i<=s.length()-1; i++) {
			
			if(hs.add(ch[i])== false)
				return ch[i];
		}
		return (Character) null;
		
	}
	
}
