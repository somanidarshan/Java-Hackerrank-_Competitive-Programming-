package loops;

import java.util.Scanner;

public class Choclate {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("value of n is"+n);
			int m=sc.nextInt();
			System.out.println("value of m is "+m);

			int d=sc.nextInt();
			System.out.println("value of d is"+d);

			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				 arr[i]=sc.nextInt();
			}
			int sum=0;
			int k=0;
			int count=0;
			for(int i=k;i<n;i++) {
				for(int j=i;j<m;j++) {
					if(m>n) {
						break;
					}
					sum+=arr[j];
				}
					if(sum==d) {
						count+=1;
						
						k=k+1;
						m=m+1;
						
					}
					else{
						k=k+1;
						m=m+1;
					}
			sum=0;
					
					
				}

			
			System.out.println(count);

			
	}

}
