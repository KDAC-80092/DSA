package com.app;

public class CircularQueue 
{
	private int arr[];
	private int rear,front;
	private final int SIZE;
	private int count = 0;
	
	public CircularQueue(int size)
	{
		this.SIZE = size;
		this.rear = -1;
		this.front = -1;
		arr = new int[size];
	}
	
	public void push(int element)
	{
		rear = (rear+1)%SIZE;
		arr[rear] = element;
		count++;
	}
	
	public void pop()
	{
		front = (front+1) % SIZE;
		if(front == rear)
		{
			rear = front = -1;
		}
		count--;
	}
	
	public int peek()
	{
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isFull()
	{
		return count == SIZE;
//		return (front == rear && rear == SIZE-1) || (front == rear && rear != -1);
	}
	
	public boolean isEmpty()
	{
		return count == 0;
//		return (front == rear && rear == -1);
	}
	
	
}
