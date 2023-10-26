import java.util.Arrays;

public class NonRepeating 
{
	
	public static int noRepeat(int []arr)
	{
		int count = 0;
		for(int i = 0; i < arr.length; i++)
		{
			int j;
			for(j = 0; j < arr.length; j++)
			{
				if(i != j && arr[i] == arr[j])
				{
					break;
				}
			}
			if(j == arr.length)
				return i;
		}
		
		return -1;
	}

	public static void main(String[] args) 
	{
		
		
		int arr[] = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		
		
//		System.out.println(Arrays.toString(arr));
		
//		System.out.println(arr.length);
		
		int index = noRepeat(arr);
		if(index == -1)
		{
			System.out.println("Check");
		}
		else
		{
			System.out.println("Repeat:" + arr[index]);
		}
		
			
	}

}
