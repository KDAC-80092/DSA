package com.sunbeam;

import java.util.Scanner;

public class TestStack {

	public static void main(String[] args)
	{
		Stack stk=new Stack(10);
		Scanner sc=new Scanner(System.in);
	     int choice;
	     
	     do {
	    	 System.out.println("0 Exit");
	    	 System.out.println("1 Push");
	    	 System.out.println("2 Pop");
	    	 System.out.println("3 Peek");
	    	 System.out.print("Enter your choice");
	    	 choice=sc.nextInt();
	    	 switch (choice) {
			case 1:
				if(stk.isFull())
				{
					System.out.println("Stack is Full");
				}
				else
				{
					System.out.println("Enter Data");
					int key=sc.nextInt();
					stk.push(key);
					System.out.println("Element Added");
				}
				break;
			case 2:
				if(stk.isEmpty())
				{
					System.out.println("Stack is Empty");
				}
				else
				{
				    stk.pop();
				    System.out.println("Element Poped");
				}
				break;
			case 3:
				if(stk.isEmpty())
				{
					System.out.println("Stack is Empty");
				}
				else
				{
					int key2=stk.peek();
					System.out.println("Last Element to be added is "+key2);
				}
              break;
			default:
				System.out.println("Enter valid number please");
				break;
			}
	    	 
	     }while(choice!=0);
	     
	 
	     
	}
}
