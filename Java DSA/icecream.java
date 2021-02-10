package Icecream;

import java.util.Scanner;

public class icecream {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++) {
			arr[j]=sc.nextInt();
		}
		int sum=0;
		for(int j=0;j<n;j++) {
			for(int k=j+1;k<n;k++) {
				sum=arr[j]+arr[k];
				
				if(sum==m) {
					System.out.println((j+1)+" "+(k+1));
					break;
				}
			}
		}
	}
}

}