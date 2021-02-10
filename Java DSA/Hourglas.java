package hourglass;
import java.util.Scanner;
public class Hourglas {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[6][6];
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		int temp=-1000;
		int m=0,k=0;
		for(int j=0;j<4;j++) {
			for(int i=0;i<4;i++) {
				for( k=j;k<j+3;k++) {
					for( m=i;m<i+3;m++) {
						sum=sum+a[m][k];	
					}
				}
				sum=sum-(a[i+1][j]+a[i+1][j+2]);
				System.out.println(+sum);
				
				if(sum>temp) {
					temp=sum;
				}
				sum=0;
			}
		}
		System.out.println(+temp);
		
	}

}
