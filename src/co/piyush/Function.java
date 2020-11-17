package co.piyush;

public class Function {
	public static int findMax(int arr[])
	{
		int max;
		try
		{
			max=arr[0];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("EXCEPTION HANDLED : "+e.getMessage());
			return -1;
		}
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int findMin(int arr[])
	{
		int min;
		try
		{
			min=arr[0];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("EXCEPTION HANDLED : "+e.getMessage());
			return -1;
		}
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	public static int findSum(int arr[])
	{
		int sum;
		try
		{
			sum=arr[0];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("EXCEPTION HANDLED : "+e.getMessage());
			return -1;
		}
		for(int i=1;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
}
