package minimumswaps;

import java.util.Scanner;

public class Beautiful {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int diff=arr[i+1]-arr[i];
			for(int j=i+2;j<n;j++) {
				int x=arr[i]-arr[j];
			}
		}
	}

}
