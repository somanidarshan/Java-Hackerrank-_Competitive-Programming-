package valley;

import java.util.Scanner;

public class countingvalley {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				String step=sc.next();
				char arr[]=new char[step.length()];
				for(int i=0;i<step.length();i++) {
					arr[i]=step.charAt(i);
				}
				int result[]=new int[step.length()];
				for(int i=0;i<step.length();i++) {
						if(arr[i]=='U') {
							result[i]=1;
							
						}
						else if(arr[i]=='D'){
							result[i]=-1;
						}
				}
						
						
					
				
				int sum=0;int count=0;
				for(int i=0;i<step.length();i++) {
					if(result[i]==1) {
						sum=sum+result[i];
						if(sum==0) {
							count+=1;
							
						}
					}
					else if(result[i]==-1) {
						sum=sum+result[i];
						if(sum==0) {
							
						}
					}
					
				}
				System.out.println(count);
	}
	

}
