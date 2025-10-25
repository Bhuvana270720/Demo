package SDET;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int a[]=new int[5];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int first=a[0];
		int second=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			else
			{
				if(a[i]>second && a[i]!=first)
				{
					second=a[i];
				}
			}
		}
		System.out.println(second);

	}

}
