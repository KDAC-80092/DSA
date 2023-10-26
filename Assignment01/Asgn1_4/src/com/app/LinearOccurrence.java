package com.app;

import java.util.Scanner;

public class LinearOccurrence 
{
	
	public static int nThOccurrence(int [] arr,int size,int key)
	{
		int count = 0;
		for(int i = 0; i < size; i++)
		{
			if(key == arr[i])
			{
				count++;
			}
		}
		
//		if(count == 1)
//		{
//			System.out.println("Unique Element is Present.");
//			return 0;
//		}
//		else
//		{
//			if(count == 0)
//			{
//				return -1;
//			}
//			else
//			{
//				return count;
//			}
//		}
		
		return count;
		
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		int arr [] = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		
		System.out.print("Enter Number to Find Nth Occurrence:");
		int key = sc.nextInt();
		
		int index = nThOccurrence(arr, arr.length, key);
		
		
		if(index == 0)
		{
			System.out.println("No Such Element is Present.");
		}
		else
		{
			System.out.println("The Occurrence of:"+key+" is:"+ index);
		}
		
		
//		if(index == -1)
//		{
//			System.out.println("No Such Element is Present.");
//		}
//		else
//		{
//			System.out.println("The Occurrence of:"+key+" is:"+ index);
//		}
		
		
		
		
		

	}

}
