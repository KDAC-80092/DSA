package com.app;

import java.util.Arrays;

public class TwoQ3 {

	public static int insertionSort(int []arr)
	{
		int count = 0;
		int temp = 0;
		for(int i = 1; i < arr.length; i++ )
		{
			temp = arr[i];
			int j = i-1;
			count++;
			while(j >= 0 && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {55,44,22,66,11,33};
		
		System.out.println("Before Sort:" + Arrays.toString(arr));
		
		int count = insertionSort(arr);
		
		System.out.println("After Sort:" + Arrays.toString(arr));
		
		System.out.println("No. of Comparisons is:" + count);

	}

}
