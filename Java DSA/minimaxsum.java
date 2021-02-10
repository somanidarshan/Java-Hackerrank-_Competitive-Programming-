package loops;

import java.util.Arrays;
import java.util.Scanner;

public class minimaxsum {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			long arr[]=new long[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextLong();
				
			}
			long maxsum=0;
			long minsum=0;
			Arrays.sort(arr);
			for(int i=0;i<n-1;i++) {
				minsum=minsum+arr[i];
			}
				for(int i=1;i<n;i++) {
					maxsum=maxsum+arr[i];
					}
			System.out.print(minsum+" "+maxsum);
			
	}

}
