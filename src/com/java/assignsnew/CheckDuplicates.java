package com.java.assignsnew;

public class CheckDuplicates {

	public static void main(String[] args) {

		// an array of numbers
		int[] numsArray = { 1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 8, 9, 9, 10 };

		int dupNum = 0, dupTimes = 1;
		
		int previousNum = numsArray[0];
		
		System.out.println("Number:DuplicateCount");
		
		for (int i = 1; i < numsArray.length; i++) {
			if (numsArray[i] == previousNum) {
				dupTimes++;
			} else {
				System.out.println(previousNum + ":" + dupTimes);
				previousNum = numsArray[i];
				dupTimes = 1;
			}
			if (i == numsArray.length - 1) {
				System.out.println(numsArray[i] + ":" + dupTimes);
			}
		}
	}

}