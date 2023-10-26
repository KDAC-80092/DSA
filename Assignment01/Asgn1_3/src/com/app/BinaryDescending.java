package com.app;

import java.util.Scanner;

public class BinaryDescending {

	public  static int binaryDescending(int arr[],int size,int key)
	{
		int left = 0;
		int right = size-1;
		int mid;
		
		while(left<=right)
		{
			mid = (left + right)/2;
			if(key == arr[mid])
			{	
				return mid;
			}
			else if(key>arr[mid])
			{
				right = mid-1;
			}
			else
			{
				left = mid + 1;
			}
		}
		
		
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr [] = {99,88,77,66,55,44,33,22,11};
		
		System.out.println("Enter Key To Find:");
		int key = sc.nextInt();
		
		int index = binaryDescending(arr,arr.length,key);
		
		if(index == -1)
		{
			System.out.println("Element Not Found.");
		}
		else
		{
			System.out.println("Key Found at Index:" + index);
		}
		
		
		
		

	}

}
