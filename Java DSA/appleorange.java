package loops;

import java.util.Scanner;

public class appleorange {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int s=sc.nextInt();

			int t=sc.nextInt();
	        int arr2[]=new int[2];


			for(int i=0;i<2;i++){
	            arr2[i]=sc.nextInt();
	        }

			int m=sc.nextInt();

			int n=sc.nextInt();
			int w,q;

			int apple[]=new int[m];
			int orange[]=new int[n];

			for(int i=0;i<m;i++) {
				apple[i]=sc.nextInt();
				
			}
			for(int j=0;j<n;j++) {
				apple[j]=sc.nextInt();
				
			}
			int count=0;
			int e=0;

			for(int k=0;k<m;k++) {
					q=apple[k]+arr2[0];
						if(s<=q&&q<=t) {
								e=e+1;
						}
						else {
							q=0;
								}

				}
				


			

			for(int l=0;l<n;l++) {
					w=orange[l]+arr2[1];
						if(s<=w&&w<=t) {
							count=count+1;
						}
						else {
								w=0;
									}

				}

			
			
				
				
				
	System.out.println(e+" "+count);
	
	}

}
