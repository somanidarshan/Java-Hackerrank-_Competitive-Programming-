package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class twopointers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		System.out.println("Enter no. of test cases");
		while(t-->0) {
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		twopointers g=new twopointers();
		if(g.findtriplets(arr,n)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
		
	}
	public boolean findtriplets(int arr[],int n) {
		Arrays.sort(arr);
		for(int i=0;i<n-2;i++) {
			if(twosum(arr,-arr[i],i+1)) {
				return true;
			}
		}
		return false;
		
	}
	public boolean twosum(int arr[],int x,int i) {
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]+arr[j]>x) {
				j--;
			}
			else if(arr[i]+arr[j]<x) {
				i++;
			}
			else {
				return true;
			}
		}
		return false;
		
	}

}
