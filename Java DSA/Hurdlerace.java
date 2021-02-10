package hurdle;

import java.util.Arrays;
import java.util.Scanner;

public class Hurdlerace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			if(arr[n-1]>k) {
				count=arr[n-1]-k;
			}
		}
		System.out.println(count);
	}

}
