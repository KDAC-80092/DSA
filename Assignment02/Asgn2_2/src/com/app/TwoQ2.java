package com.app;

import java.util.Arrays;

public class TwoQ2 {
	
	public static int countBubbleSort(int []arr)
	{
		int pass = 0;
		int count  = 0;
		int flag = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			pass++;
			for(int j = 0; j < arr.length-1; j++)
			{
				count++;
				if(arr[j]>arr[j+1])
				{
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		
		System.out.println("Pass:" + pass);
		
		return count;
	}

	public static void main(String[] args) {
		
//		int arr[] = {11, 1, 9, 5, 13, 6, 25, 3, 4};
		int arr[] = {1,2,3,4,5};
		
		System.out.println("Before Sort:" + Arrays.toString(arr));
		int count = countBubbleSort(arr);
		System.out.println("After Sort:" + Arrays.toString(arr));
		
		System.out.println("Count: "+count);

	}

}
