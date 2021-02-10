package diagonal;

import java.util.Scanner;

public class differene {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int rows= sc.nextInt();
        int col=rows;
        int dif=0;
        int a[][]=new int[rows][col];
        int b[][]=new int[rows][col];
        int sum=0;
        int count=0;
        for(int i=0;i<rows;i++) {
       	 for(int j=0;j<col;j++) {
       		 a[i][j]=sc.nextInt();
       	 }
        }
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<col;j++) {
        		if(i==j) {
        			sum=sum+a[i][j];
        		}
        	}
        }
        for(int i=0;i<rows;i++) {
        	for(int j=0;j<col;j++) {
        		if(i+j==rows && i+j==col) {
        			count=count+a[i][j];
        		}
        	}
        	
        }
    	System.out.println(sum);
    	System.out.println(count);

        if(count>sum) {
        	dif=count-sum;
        	System.out.println(dif);
        }
        else {
        	dif=sum-count;
        	System.out.println(dif);

        }
        
	}

}
