package minimumswaps;

import java.util.Arrays;
import java.util.Scanner;

public class Minswaps {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int arr[]=new int[n];
		int ary[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ary[i]=sc.nextInt();
		}
		Arrays.sort(ary);
		for(int i=0;i<n;i++) {
			int x=ary[i];
			if(arr[i]==ary[i]) {
				
			}
			else {
				for(int j=0;j<n;j++) {
					while(x==arr[j]) {
						int temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						count=count+1;					
					}
				}
			}
		}
		System.out.println(+count);
	}

}
