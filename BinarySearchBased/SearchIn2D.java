package BinarySearchBased;

import java.util.Scanner;

public class SearchIn2D {
	//function
	public static void binarySearch(int a[][],int data) {
		
		int r=a.length-1;
		int c=0;
		
		while(r>=0 || c<a.length) {
			if(a[r][c]==data) {
				System.out.print(r+","+c);
				return;
			}
			else if(a[r][c]>data) r--;
			else c++;
		}
		System.out.print("no such value");
	}

	public static void main(String[] args) {
		//given 1.2d array  || 2.data to be searched
		//taking input
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		int a[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=scn.nextInt();
			}
		}
		int data=scn.nextInt();
		binarySearch(a,data);
		

	}

}
