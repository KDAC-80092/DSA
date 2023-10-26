package com.app;

//1. Write a program to print no of comparisions done to search a key in
//i. binary search

import java.util.Scanner;

public class Binary_Search {

	public static int binarySearch(int arr[],int size,int key)
	{
		int count = 0;
		int left = 0,right = size-1,mid;
		
		while(left<=right)
		{
			count++;
			mid = (left+right)/2;
			if(key == arr[mid])
			{
				System.out.println("Value Found At index:"+mid);
				return count;
			}
			else if(key<arr[mid])
			{
				right = mid-1;
			}
			else
			{
				left = mid+1;
			}
			
		}
		
		return -1;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int arr[] = {9,11,13,22,33,44,55,66,77,88,99,110};
		
		System.out.print("Enter Key to Find:");
		int key = sc.nextInt();
			
		int count  = Binary_Search.binarySearch(arr, arr.length, key);
		
		if(count == -1)
		{
			System.out.println("Key Not Found.");
		}
		else
		{
			System.out.println("Comparison Done to Search A Key is:"+ count);
		}
		
		

	}

}
