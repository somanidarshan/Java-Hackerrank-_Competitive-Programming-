package radiotransmitters;
import java.util.Arrays;
import java.util.Scanner;
public class Radiotransmitters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int s=0;
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		if(n==1) {
			count=1;
		}
		for(int i=0;i<n-1;i++) {
			if(arr[i+1]-arr[i]>k) {
				count=count+1;
			}
			else {
				count=count+1;
				int temp=arr[i+1];
				for(int j=i+1;j<n;j++) {
					if((arr[j]-temp)<=k) {
						s=s+1;
					}
				}
				i=s;
			}		
	}
		System.out.println(count);
		
	}

}
