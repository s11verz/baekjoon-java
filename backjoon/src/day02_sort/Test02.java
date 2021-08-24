package day02_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String[] arr=new String[n+1];
	arr[n]="";
	String temp;
	
	for(int i=0;i<n;i++) {
		arr[i]=sc.next();
	}
	
	Arrays.sort(arr);

	for(int i=0;i<n+1;i++) {
		for(int j=0;j<n;j++) {
			if(arr[j].length()>arr[j+1].length()) {
				temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
			
		}
		
	}
	
	for(int i=0;i<n;i++) {
		if(arr[i].length()==arr[i+1].length()){
			if(arr[i].contains(arr[i+1])) continue;
		}
		System.out.println(arr[i+1]);
	}
}
}
