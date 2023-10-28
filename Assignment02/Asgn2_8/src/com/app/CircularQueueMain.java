package com.app;

import java.util.Scanner;

public class CircularQueueMain {

	public static void main(String[] args) 
	{
		CircularQueue q = new CircularQueue(5);
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		
		do 
		{
			System.out.println("*****************************");
			System.out.println("0.EXIT.");
			System.out.println("1.Push.");
			System.out.println("2.Pop.");
			System.out.println("3.Peek.");
			System.out.print("Enter Choice:");
			choice = sc.nextInt();
			
			System.out.println("****************************");
			
			switch (choice) {
			case 1:
				
				if(q.isFull())
				{
					System.out.println("Queue is Full.");
				}
				else
				{
					System.out.print("Enter element:");
					int element = sc.nextInt();
					q.push(element);
					System.out.println("Element Successfully Pushed.");
				}
				
				break;
				
			case 2:
				
				if(q.isEmpty())
				{
					System.out.println("Queue is Empty.");
				}
				else
				{
					q.pop();
					System.out.println("Element Popped Successfully.");
				}
				
				break;
				
			case 3:
				
				if(q.isEmpty())
				{
					System.out.println("Queue is Empty.");
				}
				else
				{
					System.out.println("Peeked Element is:"+ q.peek());
				}
				
				break;

			default:
				
				if(choice == 0)
					break;
				
				System.out.println("Wrong! Choice.");
				
				break;
			}
			
		} while (choice != 0);
		
		System.out.println("Thank You.");
		
		sc.close();

	}

}
