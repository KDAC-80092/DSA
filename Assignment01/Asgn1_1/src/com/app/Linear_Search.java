package com.app;

import java.util.Scanner;

//1. Write a program to print no of comparisions done to search a key in
//i. linear search




public class Linear_Search {
	
	public static int linearSearch(int arr[],int size,int key)
	{
		int count = 0;
		int  i;
		
		for(i = 0; i < size; i++)
		{
			count++;
//			System.out.println("Value at arr["+i+"] is:"+ arr[i]);
			if(arr[i] == key)
			{
				System.out.println("Key found at index:" + i);
				return count;
			}
		}
		
		return -1;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.print("Enter size Of an Array:");
		size = sc.nextInt();
		
		int arr[] = new int[size];
//		int arr[] = {9,11,13,22,33,44,55,66,77,88,99,110};
		
		for(int i = 0;i<size;i++)
		{
			System.out.print("Enter Value At "+(i+1)+" :");
			arr[i] = sc.nextInt();
		}
		
		
		System.out.print("Enter key to search:");
		int key = sc.nextInt();
		
		int count = linearSearch(arr,arr.length,key);
		
		if(count != -1)
		{
			System.out.println("Comparison Done to Search Key is: " + count);
		}
		else
		{
			System.out.println("Key Not Found All Indexes Searched:" + arr.length);
		}
		
		
		sc.close();
		

	}

}
