package taumanbday;

import java.util.Scanner;

public class Taumkabady {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			long b=sc.nextInt();
			long w=sc.nextInt();
			long bc=sc.nextInt();
			long wc=sc.nextInt();
			long z=sc.nextInt();
			long sum=0;
			if((bc+z)<wc) {
				long x=bc;
				bc=bc+z;
				
				sum=(x*b)+(bc*w);
				System.out.println(sum);
			}
			else if((wc+z)<bc) {
				long x=wc;
				wc=wc+z;

				sum=(wc*b)+(x*w);
				System.out.println(sum);
			}
			else {
				sum=((bc*b)+(wc*w));
				System.out.println(sum);
			}
			
			
		}
		
	}

}
