package bill;

import java.util.Scanner;

public class Billdivision {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int index=sc.nextInt();
			int result=0;
			int bill[]=new int[n];
			int sum1=0;
			for(int i=0;i<n;i++) {
				bill[i]=sc.nextInt();
			}
			int charge=sc.nextInt();
			int sum=0;
			for(int i=0;i<n;i++) {
				sum=sum+bill[i];
			}
			sum=sum-bill[index];
			sum1=sum/2;
			if(sum1==charge) {
				System.out.println("Bon Appetit");
			}
			else {
				result=charge-sum1;
				System.out.println(result);
			}
	}

}
