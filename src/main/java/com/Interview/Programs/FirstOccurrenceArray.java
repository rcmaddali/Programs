package com.Interview.Programs;

public class FirstOccurrenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int number = 10;
		System.out.println(getIndex(arr, number));

	}

	public static String getIndex(int a[], int n) {

		int length = a.length - 1;
		int i = 0;
		while (i <= length) {
			int mid = i + (length - 1) / 2;
			if (a [mid] == n)
				return String.valueOf(mid);
			else if (a[mid] < n)
				i = mid + 1;
			else if (a[mid] > n)
				length = mid - 1;
		}
		return "Number not found";
	}
}

//====================================================
//Map<Integer, Integer> indexMap = new LinkedHashMap<Integer, Integer>();
//
//if (a.length <= 0)
//	return "No elements in the array";
//else if (a.length == 1 && a[0] == n)
//	return "0";
//else if (a.length >= 1) {
//	for (int i = 0; i <= a.length - 1; i++) {
//		if (indexMap.containsKey(a[i])) {
//			indexMap.put(a[i], indexMap.get(a[i]));
//		} else {
//			indexMap.put(a[i], i);
//		}
//
//	}
//	if (indexMap.containsKey(n)) {
//		return indexMap.get(n).toString();
//	}
//
//}
//return "Number not found";
