package com.app;

public class DoublyMain {

	public static void main(String[] args) {
		
		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.fDisplay();
		list.rDisplay();
		list.addLast(50);
		list.fDisplay();
		list.rDisplay();
//		list.deleteFirst();
//		list.fDisplay();
//		list.deleteFirst();
//		list.fDisplay();
//		list.deleteFirst();
//		list.fDisplay();
//		list.deleteFirst();
//		list.fDisplay();
//		list.deleteFirst();
//		list.fDisplay();
		
//		list.deleteLast();
//		list.fDisplay();
		
		list.addPosition(60, 6);
		list.fDisplay();
		
		list.addPosition(70, 7);
		list.fDisplay();
		
		list.addPosition(80, 8);
		list.fDisplay();
		
		list.addPosition(90, 9);
		list.fDisplay();
		
		list.addPosition(100, 10);
		list.fDisplay();
		
		list.addPosition(110, 11);
		list.fDisplay();
		
		list.addPosition(120, 12);
		list.fDisplay();
//		
//		list.deletePosition(2);
//		list.fDisplay();
//		
//		list.deletePosition(13);
//		list.fDisplay();
//		
//		list.deletePosition(14);
//		list.fDisplay();
		
//		list.deletePosition(1);
//		list.fDisplay();
//		
//		list.deletePosition(2);
//		list.fDisplay();
//		
		list.deletePosition(14);
		list.fDisplay();
		
		list.deletePosition(11);
		list.fDisplay();
		
		list.deletePosition(5);
		list.fDisplay();
		
	}

}
