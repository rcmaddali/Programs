package com.Interview.Programs;

public class AlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "ab12cd34ef56";
		//System.out.println(total(a));
		System.out.println(total(a));

	}

	public static int total(String s) {

		String nums[] = s.split("");

		int sum = 0;

		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i].matches("[0-9]"))
				sum = sum + Integer.parseInt(nums[i]);
			//System.out.println(sum);
		}

		return sum;
	}

}
