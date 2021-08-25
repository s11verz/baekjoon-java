package day03_backtracking;

import java.util.Scanner;

public class Q2580 {
	public static int[][]arr=new int[9][9];
	public static int count=0;
	public static int sum=0;
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<9;i++) {
		for(int j=0;j<9;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	
	fillRow();
	fillCol();
	fillSquare();
	
	for(int i=0;i<9;i++) {
		for(int j=0;j<9;j++) {
			System.out.print(arr[i][j]+" ");
		}System.out.println(" ");
	}
	
}
public static void fillRow() {
	
	for(int i=0;i<9;i++) {
		for(int j=0;j<9;j++) {
			if(arr[i][j]==0) {
				count++;
			}sum+=arr[i][j];
		}if(count==1) {
			for(int j=0;j<9;j++) {
				if(arr[i][j]==0) {
					arr[i][j]=(45-sum);
				}
			}
		}sum=0;
		count=0;
	}
	return;
}
public static void fillCol() {
	for(int i=0;i<9;i++) {
		for(int j=0;j<9;j++) {
			if(arr[j][i]==0) {
				count++;
			}sum+=arr[j][i];
		}if(count==1) {
			for(int j=0;j<9;j++) {
				if(arr[j][i]==0) {
					arr[j][i]=(45-sum);
				}
			}
		}sum=0;
		count=0;
	}
	return;
}
public static void fillSquare() {
	for(int i=0;i<9;i+=3) {
		for(int j=0;j<9;j+=3) {
			for(int a=i;a<i+3;a++) {
				for(int b=j;b<j+3;b++) {
					sum+=arr[a][b];
				}
			}for(int a=i;a<i+3;a++) {
				for(int b=j;b<j+3;b++) {
					if(arr[a][b]==0) {
						arr[a][b]=(45-sum);
					}
				}
			}sum=0;
			count=0;
		}
	}
	return;
}
}
