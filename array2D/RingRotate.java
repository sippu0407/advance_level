package array2D;

import java.util.Scanner;

public class RingRotate {

	public static void main(String[] args) {
		//given  1.2D matrix
		    //   2.shell No.
		    //   3.Rotate No.

		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		int a[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=scn.nextInt();
			}
		}
		
		int shellNo=scn.nextInt();
		int rotate=scn.nextInt();
		//steps
		//1. 1d array banao shell elements ka
		//2.  1d array ko rotate karo by rorate No. anticlockwise
		//3. 1d array ke elements ko fill kardo shell no. me
		
		
		
		

	}

}
