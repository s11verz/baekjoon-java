package day02_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] arr=new int[n][2];
	
	
	for(int i=0;i<n;i++) {
		for (int j=0;j<2;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	
	sc.close();
	
	Arrays.sort(arr,(num1,num2)->{
		
		if(num1[1]==num2[1])
			return Integer.compare(num1[0], num2[0]);
		else
			return Integer.compare(num1[1], num2[1]);
		
	
	});
	
	
	
	
	
	for(int a=0;a<n;a++) {
		for(int b=0;b<2;b++) {
			System.out.print(arr[a][b]+" ");
		}
		System.out.println();
	}
	
}
}
