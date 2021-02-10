package sequence;

import java.util.Scanner;

public class Sequenceequation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				if(a[j]==i) {
					j=j+1;
					for(int k=0;k<n;k++) {
						if(a[k]==j) {
							System.out.println(k+1);
						}
					}
				}
			}
		}
		
	}

}
