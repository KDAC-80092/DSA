package com.sunbeam;

public class Stack {
	private int arr[];
	private int size;
	private int top;
	
	public Stack(int size)
	{
		this.size=size;
		arr=new int[size];
		top=size-1;
	}
	
	public void push(int data)
	{
		arr[top]=data;
		top--;
	}

	public void pop()
	{
		top++;
	}
	public int peek()
	{
		return arr[top+1];
	}
	public boolean isFull()
	{
		return (top==-1);
	}
	public boolean isEmpty()
	{
		return (top==size-1);
	}
}
