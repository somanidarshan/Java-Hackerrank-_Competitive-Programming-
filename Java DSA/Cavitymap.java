package cavitymap;

import java.util.Scanner;

public class Cavitymap {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 String arr[]=new String[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.next();
			 }
		 for(int i=0;i<n;i++) {
			 String x=arr[i];
			 int q=x.length();
			 for(int j=0;j<q;j++) {
				if(j!=0 && j!=q-1) {
					if(x.charAt(j)>x.charAt(j-1) &&x.charAt(j)>x.charAt(j+1)) {
					System.out.print("X");
					
					}
					else {
						System.out.print(x.charAt(j));
					}
					
					
				}
				else {
					System.out.print(x.charAt(j));
				}
				
				
				
			 }

			 System.out.println(" ");
			 
			 
		 }
		 
		 
	}

}
