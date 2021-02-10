package picking;

import java.util.Arrays;
import java.util.Scanner;

public class Picking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int dum=0;
		int q=0;
		int d=0;
		int count=1;
		Arrays.sort(arr);
		for(int i=0;i<n-2;i++) {	
			if(arr[i+1]-arr[i]<=1 && arr[i+2]-arr[i]<=1) {
				count=count+2;
				i=i+1;
				d=count;
				dum=1;
				if(d>q) {
					q=d;
					
				}
			}
			else if(arr[i+1]-arr[i]<=1 && arr[i+2]-arr[i]>1) {
				count=count+1;
				d=count;
				dum=1;
				if(d>q) {
					q=d;
					
					
				}
			}
			if(arr[i+2]-arr[i]>1) {
			count=1;
			}
		}
		System.out.println(q);			
	}
}
