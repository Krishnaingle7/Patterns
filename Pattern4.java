package com.company;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For D pattern
		int n=10;
		for( int i=0; i<n ; i++)
		{
			for( int j=0; j<n; j++)
			{
				if(j==0 || i==0 && j<(n-1)/2 || i==n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
