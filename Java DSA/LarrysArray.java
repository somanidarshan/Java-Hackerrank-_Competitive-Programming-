package larrysarray;

import java.util.Arrays;
import java.util.Scanner;

public class LarrysArray {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			int count=0;
			for(int i=0;i<t;i++) {
				count=0;
				int n=sc.nextInt();
				int a[]=new int[n];
				int arr[]=new int[n];
				for(int j=0;j<n;j++) {
					arr[j]=a[j]=sc.nextInt();
				}
				Arrays.sort(arr);
				for(int k=0;k<n-2;k++) {
					if(a[k]!=arr[k]) {
						for(int j=1;j<=3;j++) {
							if(a[k]!=arr[k]) {
							int temp=a[k];
							a[k]=a[k+1];
							a[k+1]=a[k+2];
							a[k+2]=temp;
							}
						}
					}
				}
				for(int b=0;b<n;b++) {
					if(a[b]==arr[b]) {
						count=count+1;
					}
				}
				if(count==n) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
	   }
  }
