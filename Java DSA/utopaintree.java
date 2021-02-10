package utopain;

import java.util.Scanner;

public class utopaintree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int a[]=new int[n+1];
			a[0]=1;
			int sum=1;
			for(int j=1;j<=n;j++) {
				if((j%2)==0) {
					sum=sum+1;
					a[j]=sum;
					
				}
				else {
					sum=sum*2;
					a[j]=sum;
				}
			}
			System.out.println(a[n]);
		}
	}

}
