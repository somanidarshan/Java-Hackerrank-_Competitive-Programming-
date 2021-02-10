package equilize;

import java.util.Scanner;

public class Equilizearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int x=0;
		int dummy=0;
		for(int i=0;i<n;i++) {
			int count=0;
			int temp=a[i];
			for(int j=0;j<n;j++) {
				if(a[j]==temp) {
					count=count+1;
				}
			}
			if(count>x) {
				x=count;
				dummy=a[i];
			}
		}
		int deletions=0;
		for(int k=0;k<n;k++) {
			if(a[k]!=dummy) {
				deletions+=1;
			}
		}
		System.out.println(deletions);
	}

}
