package com.app;

public class LinearQueue 
{
	private int arr[];
	private int rear,front;
	private final int SIZE;
	public LinearQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = 0;
		rear  = 0;
		
	}
	
	public void push(int data)
	{
		arr[rear] = data;
		rear++;
	}
	
	public void pop()
	{
		front++;
	}
	
	public int peek()
	{
		return arr[front];
	}
	
	public boolean isFull()
	{
		return rear == SIZE;
	}
	
	public boolean isEmpty()
	{
		return rear == front;
	}	
	
	
}
