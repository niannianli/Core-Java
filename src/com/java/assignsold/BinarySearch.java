package com.java.assignsold;

public class BinarySearch {
	
	public static void main(String[] args){

	// already sorted array
	int[] arr = { 2, 3, 4, 10, 40 };
	
	// number I am searching for is in the array
	int x = 40;
	
	// number I am searching for is not in the array
	int y = 5;
	
	int result1 = binarySearch(arr, 0, arr.length, x);
	int result2 = binarySearch(arr, 0, arr.length, y);
	
	if(result1==-1)System.out.println("4 not in array");
	else System.out.println("4 in array at index: " + result1);
	
	if(result2==-1)System.out.println("5 not in array");
	else System.out.println("5 in array at index: " + result2);
	
	}

	
	public static int binarySearch(int[] arr, int begin, int end, int number){
       
		if (begin<=end){
			
			// for example, begin = 0, end = 5, mid = 0 + (5-1 - 0)/2 = 2, which is the third number, the middle number
            int mid = begin + (end - 1 - begin)/2;
 
            // if middle number is the number we are looking for, return the index mid
            if (arr[mid] == number)
               return mid;
 
            // if middle number is bigger than the number we are looking for, now search for the left half
            if (arr[mid] > number)
               return binarySearch(arr, begin, mid-1, number);
 
            // if middle number is smaller than the number we are looking for, now search for the right half
             return binarySearch(arr, mid+1, end, number);
        }
 
        // did not return anything before, number is not in array
        return -1;
	
}
	
}