package com.app;

import java.util.Scanner;

public class Rank {

	public static void rank(int arr[],int key)
	{
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(key >= arr[i])
			{
				count++;
			}
		}
		
		System.out.println("Rank Of "+key+" is: "+count);
	}
	
	public static void main(String[] args) 
	{
		
		int arr [] = {10,20,15,3,4,4,1};
		System.out.print("Enter Key:");
		int key = new Scanner(System.in).nextInt();
		
		rank(arr,key);
		
	}

}
