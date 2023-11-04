package com.app.tester;

import com.app.Linear_Tail;

public class TailMain {

	public static void main(String[] args) {
		
		Linear_Tail lt = new Linear_Tail();
		
		lt.fDisplay();
		
		lt.addFirst(40);
		lt.fDisplay();
		
		lt.addFirst(30);
		lt.fDisplay();
		
		lt.addFirst(20);
		lt.fDisplay();
		
		lt.addFirst(10);
		lt.fDisplay();
		
		
		lt.addLast(50);
		lt.fDisplay();
		
//		lt.deleteLast();
//		lt.fDisplay();
		
//		lt.deleteFirst();
//		lt.fDisplay();
		
//		lt.addPosition(60, 3);
//		lt.fDisplay();
//		
//		lt.addPosition(70, 8);
//		lt.fDisplay();
		
		lt.deletePosition(6);
		lt.fDisplay();
		
		

	}

}
