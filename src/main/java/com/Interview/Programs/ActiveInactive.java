package com.Interview.Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ActiveInactive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,0,0,0,0,1,0,0};
		int days =2;
		System.out.println(getState(days, arr));

	}
	
	public static List<Integer> getState(int num, int[] arr) {
		int[] temp = new int[arr.length];
		for(int days =1 ; days<=num; days++) {
			for(int i = 0;i<arr.length;i++) {
				if(i==0) {
					temp[i] = arr[i+1]==0 ? 0 : 1;
				}else if (i == arr.length-1) {
					temp[arr.length-1] = arr[i-1]==0 ? 0 : 1;
				}
				else {
					if(arr[i-1] == arr[i+1]) {
						temp[i] = 0;
					}else {
						temp[i] = 1;
					}
				}
			}
			arr = temp.clone();
		}
		List<Integer> ls = Arrays.stream(arr).boxed().collect(Collectors.toList());
		return ls;
		
	}

}
