package search;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args)
	{
		boolean found=false;
		int[] ar = {1,2,3,4,5,6,7,8,9,12,32,42,41,25};
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();
		sc.close();
		long end=0;
		long start = System.nanoTime();
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==search)
			{
				found=true;
			}
			else
			{
				continue;
			}

		}
		if(found)
		{
			System.out.println("Found the Element in our Array");
			end = System.nanoTime();
			System.out.println((end-start)/ar.length+" ns");

		}
		else
		{
			System.out.println("No Element found in the array ");
			end = System.nanoTime();
			System.out.println((end-start)/ar.length+" ns");

		}	

	}

}
