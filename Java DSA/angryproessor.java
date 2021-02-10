package sorting;

import java.util.Scanner;

public class angryproessor {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			for(int i=0;i<t;i++) {
				int n=sc.nextInt();
				int k=sc.nextInt();
				int arr[]=new int[n];
				for(int j=0;j<n;j++) {
					arr[j]=sc.nextInt();
					}
				int count=0;
				for(int h=0;h<n;h++) {
					if(arr[h]<=0 )
					{
						count+=1;
						
					}
				
						
				}
				if(count>=k) {
					System.out.println("NO");
				}
				else {
					System.out.println("YES");
				}
			}
			
			
	}

}
