package loops;
import java.util.Scanner;

public class Divisiblepairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();

		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		int count=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				sum=arr[i]+arr[j];
				if(sum%k==0) {
					count+=1;
					
				}
			sum=0;	
			}
		}
		
		System.out.println(count);
	}

}
