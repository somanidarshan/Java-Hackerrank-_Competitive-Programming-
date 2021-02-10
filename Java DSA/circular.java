package circularrotation;

import java.util.Scanner;

public class circular {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int k=sc.nextInt();
         int q=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++) {
       	  arr[i]=sc.nextInt();
         }
         int arr1[]=new int[n];
         for(int i=0;i<k;i++) {
        	 for(int j=0;j<n;j++) {
        	 arr1[0]=arr[n-1];
        	 	if(j!=n-1) {
        			 arr1[j+1]=arr[j];
        		 }
            	 System.out.print(arr1[j]);

        	 }
        	 for(int f=0;f<n;f++) {
        		 arr[f]=arr1[f];
        	 }
         }
         for(int i=0;i<q;i++) {
        	 int d=sc.nextInt();
        	 System.out.println(arr[d]);
        	 
         }
	}

}
