package sorting;

import java.util.Scanner;

public class BubbleSort_Recursive {

	public void bubbleSort(int arr[], int n)
	{
		if(n==1)
			return;

		for(int i=0;i<n-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				int temp=arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			bubbleSort(arr, n-1);
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
		BubbleSort_Recursive BR = new BubbleSort_Recursive();
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
		BR.print(arr);
		System.out.println("Sorted Array order");
		long st = System.nanoTime();
		BR.bubbleSort(arr, n);
		long end = System.nanoTime();
		BR.print(arr);
		System.out.println("Time Taken: "+(end-st)+" ns");
		sc.close();
	}

}
