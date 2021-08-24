package day03_backtracking;

import java.util.Scanner;

public class Q14888 {
	
	
	public static int[] numArr;
	public static int[] opArr;
	public static int n;
	public static int min=0;
	public static int max=0;
	
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	numArr=new int[n];
	opArr=new int[4];

	
	for(int i=0;i<n;i++) {
		numArr[i]=sc.nextInt();
	}
	
	for(int i=0;i<4;i++) {
		opArr[i]=sc.nextInt();
		
	}
	
	sc.close();
	
	min=Integer.MAX_VALUE;
	max=Integer.MIN_VALUE;
	
	dfs(numArr[0],1);
	
	

	System.out.println(max);
	System.out.println(min);

	
}
public static void dfs(int num,int index) {
	
	
	
	if(index==n) {
		max=Math.max(max, num);
		min=Math.min(min, num);
		return;
	}
	for(int i=0;i<4;i++) {
		if(opArr[i]>0) {
			opArr[i]--;
			
			switch (i) {
			case 0: dfs(num+numArr[index],index+1); break;
			case 1: dfs(num-numArr[index],index+1); break;
			case 2: dfs(num*numArr[index],index+1); break;
			case 3: dfs(num/numArr[index],index+1); break;
			}
			opArr[i]++;
			
		}
	}
	
	
	
}

}