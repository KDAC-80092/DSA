package com.app;

public class Linear_Tail 
{
	public class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data = data;
			next = null;
		}
		
		
	}
		
		
	private Node head;
	private Node tail;

	public Linear_Tail() 
	{
		this.head = null;
		this.tail = null;
	}
	
	
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	
	public void addPosition(int value,int pos)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head = newnode;
			tail = newnode;
		}
		else if(pos <= 1)
			addFirst(value);
		
		else
		{
			Node trav = head;
			
			for(int i = 1; i < pos - 1 && trav.next != null; i++)
			{
				trav = trav.next;
			}
			
			newnode.next = trav.next;
			trav.next = newnode;
			
		}	
	}
	
	public void deletePosition(int pos)
	{
		if(isEmpty())
		{
			System.out.println("List is Empty.");
			return;
		}
		else if(head.next == null)
			head = null;
		else if(pos <= 1)
			deleteFirst();
		else
		{
			Node trav = head;
			for(int i = 1; i < pos - 1 && trav.next.next != tail.next ; i++)
				trav = trav.next;
			
			trav.next = trav.next.next;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty.");
			return;
		}
		
		head = head.next;	
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty.");
			return;
		}
		Node trav = head;
		while(trav.next.next != null)
			trav = trav.next;
		trav.next = null;
		
	}
	
	
	
	public void fDisplay()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty.");
			return;
		}
		
		Node trav = head;
		System.out.print("List:");
		
		while(trav != null)
		{
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
		
		System.out.println();			
	}
	
	
	
	
}
