package day03_backtracking;

import java.util.Scanner;

public class Q14889 {
	public static int[][] arr;
	public static boolean[] visit;
	public static int n;
	public static int startSum;
	public static int linkSum;
	public static int count=0;
	public static int difVal=0;
	public static int min=Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		arr=new int[n][n];
		visit=new boolean[n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		sc.close();
		findComb(0,0);
		System.out.println(min);
		
		
	}
	public static void findComb(int index, int count) {
		
		if(count==n/2) {
			findDif();
			return;
		}
		for(int i=index;i<n;i++) {
			if(!visit[i]) {
				visit[i]=true;
				findComb(index+1,count+1);
				visit[i]=false;
			}
		}
		
	}
	public static void findDif() {
		startSum=0;
		linkSum=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(visit[i]==true&&visit[j]==true) {
					startSum+=arr[i][j];
					startSum+=arr[j][i];
				}else if(visit[i]==false&&visit[j]==false) {
					linkSum+=arr[i][j];
					linkSum+=arr[j][i];
					
				}
			}
		}
		difVal=Math.abs(startSum-linkSum);
		min=Math.min(difVal, min);
	}
}