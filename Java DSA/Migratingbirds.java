package loops;

import java.util.Arrays;
import java.util.Scanner;

public class Migratingbirds {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int index=0;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1) {
				a=a+1;
			}
			else if(arr[i]==2) {
				b=b+1;
			}
			else if(arr[i]==3) {
			    c=c+1;
			}
			else if(arr[i]==4) {
				d=d+1;
			}
			else {
				e=e+1;
			}
			
			
	   }
		int result[]= {0,a,b,c,d,e};
		int max=result[0];
		for(int i=0;i<6;i++) {
			if(result[i]>max) {
				max=result[i];
				
			}
			
		
		}
		for(int i=0;i<6;i++) {
			if(result[i]==max) {
				index=i;
				break;
			}
		}
		System.out.println(index);

	}
}
