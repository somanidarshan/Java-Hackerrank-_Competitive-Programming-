package tickcut;

import java.util.Arrays;
import java.util.Scanner;

public class Stickscut {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int x=0;
		int k=0;
		Arrays.sort(a);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[j]!=0) {
					k=k+1;
				}
			}
			System.out.println(k);
			if(k==1) {
				break;
			}
			x=a[n-k];
			for(int p=(n-k);p<n;p++) {
				a[p]=a[p]-x;
			}
			k=0;
			
		}
			
	}

}
