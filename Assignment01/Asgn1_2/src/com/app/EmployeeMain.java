package com.app;

import java.util.Scanner;

public class EmployeeMain 
{

	public static int searchById(Employee [] arr,int size,int key)
	{
		for(int i = 0; i < size; i++)
		{
			if(key == arr[i].getEmpid())
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static int searchByName(Employee [] arr,int size,String key)
	{
		for(int i = 0; i < size; i++)
		{
			if(key.equalsIgnoreCase(arr[i].getName()))
//			if(arr[i].getName()==key)
			{
				
				return i;
			}
		}
		
		return -1;
	}
	
	public static int searchBySalary(Employee [] arr,int size,Double key)
	{
		for(int i = 0; i < size; i++)
		{
			if(key == arr[i].getSalary())
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static int menu()
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("***************************************************");
		
		System.out.println("0.EXIT.");
		System.out.println("1.Search By Id.");
		System.out.println("2.Search By Name.");
		System.out.println("3.Search By Salary.");
				
		System.out.println("***************************************************");
		System.out.print("Enter Choice:");
		choice = sc.nextInt();
		
		return choice;
	
	}
	
	
	
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Employee Object:");
		int size = sc.nextInt();
		
		
		Employee [] arr = new Employee[size];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = new Employee();
			arr[i].accept();
		}
		
		
		
		
		
		
		
		
		
		while((choice = menu()) != 0)
		{
			switch (choice) {
			case 1:
			{
				
				System.out.print("Enter Employee ID To Search:");
				int key = sc.nextInt();
				
				int index = searchById(arr, arr.length, key);
				
				if(index == -1)
				{
					System.out.println("No Such Employee Found with Employee Id:."+key);
				}
				else
				{
					System.out.println(arr[index]);
				}
				
				break;
			}
				
			case 2:
			{
				
				System.out.print("Enter Employee Name To Search:");
				String key = sc.next();
				
				int index = searchByName(arr, arr.length, key);
				
				if(index == -1)
				{
					System.out.println("No Such Employee Found with Employee Name:."+key);
				}
				else
				{
					System.out.println(arr[index]);
				}
				
				break;
			}
			
			case 3:
				
			{
				
				System.out.print("Enter Employee Salary To Search:");
				double key = sc.nextDouble();
				
				int index = searchBySalary(arr, arr.length, key);
				
				if(index == -1)
				{
					System.out.println("No Such Employee Found with Employee Id:."+key);
				}
				else
				{
					System.out.println(arr[index]);
				}
				
				break;
			}

			default:
				
				System.out.println("Wrong! Choice...");
				break;
			}
		}
		
		System.out.println("Thank You.");
		
		
		
		sc.close();

	}

}
