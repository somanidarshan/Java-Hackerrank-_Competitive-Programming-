package Advertising;

import java.util.Scanner;

public class Advertising {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int sum=2;
			int temp=2;
			for(int i=2;i<=n;i++) {
				int k=((temp*3)/2);
				 temp=k;
				 sum=sum+k;
			}
		System.out.println(sum);	
	}

}
