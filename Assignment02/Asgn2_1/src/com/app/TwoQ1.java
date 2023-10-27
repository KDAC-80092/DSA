package com.app;

import java.util.Arrays;

public class TwoQ1 
{
	public static int countSelection(int []arr)
	{
		int count = 0;
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				count++;
				if(arr[i]>arr[j])
				{
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		return count;
	}
	
	
	public static void main(String[] args) 
	{
		
		int arr[] = {11,1,9,5,13,6,25,3,4};
		
		System.out.println("Before Sort: " + Arrays.toString(arr));
		int count = countSelection(arr);
		System.out.println("After Sort: " + Arrays.toString(arr));
		System.out.println("Number Of Comparisons:" + count);
		
		
	}
	

}
