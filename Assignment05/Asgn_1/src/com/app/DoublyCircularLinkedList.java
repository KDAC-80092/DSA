package com.app;

public class DoublyCircularLinkedList 
{
	public class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value) 
		{
			data = value;
			next = null;
			prev = null;
		}
		
	}
	
	private Node head;
	
	public DoublyCircularLinkedList() {
		head = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public int listSize()
	{
		int size = 0;
		Node trav = head;
		if(isEmpty())
			return 0;
		else
		{
			do
			{
				size++;
				trav = trav.next;
			}while(trav != head);
			
		
		}
		return size;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
			head.prev = newnode;
			head.next = newnode;
		}
		else
		{
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
			head = newnode;
		}
		
			
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head = newnode;
			head.prev = newnode;
			head.next = newnode;
		}
		
		else
		{
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
		}
		
	}
	
	public void addPosition(int value,int pos)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head = newnode;
			head.next = newnode;
			head.prev = newnode;
		}
		else if(pos <= 1)
			addFirst(value);
		
		else
		{
			Node trav = head;
			for(int i = 1; i <pos - 1 && trav.next != head; i++ )
				trav = trav.next;
			
			
			newnode.prev = trav;
			newnode.next = trav.next;
			trav.next.prev = newnode;
			trav.next = newnode;
				
		}
	}
	
	public void deletePosition(int pos)
	{
		int count = listSize();
		if(isEmpty())
		{
			System.out.println("List is Empty.");
			return;
		}
		else if(pos<=1)
			deleteFirst();
		else if(pos>=count)
			deleteLast();
		else
		{
			Node trav = head;
			
			for(int i = 1; i < pos - 1; i++)
				trav = trav.next;
				
			trav.next.next.prev = trav;
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
		else if(head.next == head || head.prev == head)
		{
			head = null;
		}
		else
		{
			head.next.prev = head.prev;
			head.prev.next = head.next;
			head = head.next;
		}
		
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty.");
			return;
		}
		else if(head.next == head)
			head = null;
		else
		{
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
		
	}
	
	
	
	public void fDisplay()
	{
		if(isEmpty())
		{
			System.out.println("List is Empty");
			return;
		}
		
		Node trav = head;
		System.out.print("List is:");
		do
		{
			System.out.print(" "+trav.data);
			trav = trav.next;
			
		}while(trav != head);
		System.out.println();
	}
	
	public void rDisplay()
	{
		Node trav = head.prev;
		System.out.print("ReverseList:");
		do
		{
			System.out.print(" "+trav.data);
			trav = trav.prev;
		
		}while(trav != head.prev);
		System.out.println();
	}
	
	
	
	
	
}
