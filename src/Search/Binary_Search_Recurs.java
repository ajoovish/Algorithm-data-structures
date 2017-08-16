package search;

import java.util.Scanner;

/*
 * This is Binary Search class made with a recursive method to find out the element
 * This class has a Complexity of O(log n)
 */
public class Binary_Search_Recurs {

	public int Binary_Recurs(int arr[], int l ,int h, int x )
	{
		if(h>l)
		{
			int mid = l +(h-l)/2;

			if(arr[mid]==x)
				return mid;
			if(arr[mid]>x)
				return Binary_Recurs(arr, l, mid-1, x);
			if(arr[mid]<x)
				return Binary_Recurs(arr, mid+1, h, x);
		}
		return -1;
	}

	public static void main(String[] args)
	{
		Binary_Search_Recurs bsr = new Binary_Search_Recurs();
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements of Array in an ascending order");

		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}

		System.out.println("The Term You are Searching for");
		int x = sc.nextInt();
		long start = System.nanoTime();
		long end=0;
		int result = bsr.Binary_Recurs(arr, 0, n-1, x);
		if(result==-1)
		{	end=System.nanoTime();
		System.out.println("Could not find element in the array in "+(end-start)+" ns");}
		else
		{end=System.nanoTime();
		System.out.println("Found element in the position "+(result+1)+" in "+(end-start)+" ns");}
		sc.close();
	}

}
