package com.app;

public class SortEmployeeMain {
	
	public static void employeeSortByInsertion(Employee[] arr)
	{
		Employee temp = new Employee();
		for(int i = 1; i < arr.length; i++)
		{
			temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j].getSalary()>temp.getSalary())
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
//	public static void employeeSort(Employee arr[])
//	{
//		Employee temp = new Employee();;
//		for(int i = 1; i < arr.length; i++ )
//		{
//			temp=arr[i];
//			int j = i-1;
//			while(j >= 0 && arr[j].getSalary()>temp.getSalary())
//			{
//				arr[j+1] = arr[j];
//				j--;
//			}
//			arr[j+1] = temp;
//		}
//	}

	public static void main(String[] args) {
		
		Employee [] arr = new Employee[3];
		
		arr[0] = new Employee(101,"Pramshant",200000);
		arr[1] = new Employee(102,"Naveen",150000);
		arr[2] = new Employee(103,"Ujjwal",10000);
		
		for(int i = 0; i < arr.length; i++)
			System.out.println("Before Sort:" + arr[i]);
		
//		employeeSort(arr);
		employeeSortByInsertion(arr);
		System.out.println("*************************************************");
		
		for(int i = 0; i < arr.length; i++)
			System.out.println("Before Sort:" + arr[i]);
		
		

	}

}
