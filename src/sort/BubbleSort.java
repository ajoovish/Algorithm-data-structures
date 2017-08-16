package sorting;

import java.util.Scanner;

/*
 * @author Ajay Vishwanathan
 * The Simplest Sorting Technique and its implementation
 * Bubble Sort
 */
public class BubbleSort {

	public void Bubble_Sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}

	public void Bubble_Sort_bound(int arr[])
	{
		boolean isSwapped= false;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
					isSwapped = true;
				}
			}
			if(isSwapped==false)
				break;
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
		BubbleSort bs = new BubbleSort();
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
		bs.print(arr);
		System.out.println("Sorted Array order");
		long st = System.nanoTime();
		bs.Bubble_Sort(arr);
		long end = System.nanoTime();
		bs.print(arr);
		System.out.println("Time Taken: "+(end-st)+" ns");
		System.out.println("Boundary Based Sorted Array order");
		long st1 = System.nanoTime();
		bs.Bubble_Sort_bound(arr);
		long end1 = System.nanoTime();
		bs.print(arr);
		System.out.println("Time Taken: "+(end1-st1)+" ns");
		sc.close();

	}

}
