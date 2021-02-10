package chocolaes;

import java.util.Scanner;

public class chockalatees {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int paise=sc.nextInt();
			int cost=sc.nextInt();
			int count=paise/cost;
			int m=sc.nextInt();
			int n=0;
			int x=count;
			while(n!=-1) {
				if(x>=m) {
					int tmp=x/m;
					count=count+tmp;
					x=x%m+tmp;
				}
				else {
					n=-1;
				}
				
			}
			System.out.println(count);
		}
	}

}
