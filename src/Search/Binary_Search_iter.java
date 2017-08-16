package search;

import java.util.Scanner;

/*
 * Complexity of O(1)
 */
public class Binary_Search_iter {
	int BinarySearch(int arr[], int x)
	{
		int h=arr.length;
		int l=0;
		while(h>=l)
		{
			int mid = l + (h-l)/2;
			if(arr[mid]==x)
				return mid;
			if(arr[mid]>x)
				h=mid-1;
			if(arr[mid]<x)
				l=mid+1;
		}
		return -1;

	}

	public static void main(String[] args)
	{
		Binary_Search_iter bsi = new Binary_Search_iter();
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
		int result = bsi.BinarySearch(arr, x);
		if(result==-1)
		{	end=System.nanoTime();
		System.out.println("Could not find element in the array in "+(end-start)+" ns");}
		else
		{end=System.nanoTime();
		System.out.println("Found element in the position "+(result+1)+" in "+(end-start)+" ns");}
		sc.close();
	}


}
