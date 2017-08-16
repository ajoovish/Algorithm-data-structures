package sorting;

import java.util.Scanner;

public class Selection_Sort {

	void SSort(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			int min = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
					min=j;

			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}

	void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args)
	{
		Selection_Sort ss = new Selection_Sort();
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the Array");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Original Array order");
		ss.print(arr);
		System.out.println("Sorted Array order");
		long st = System.nanoTime();
		ss.SSort(arr);
		long end = System.nanoTime();
		ss.print(arr);
		System.out.println("Time Taken: "+(end-st)+" ns");
		sc.close();


	}

}
