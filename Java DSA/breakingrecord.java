package breakingrecord;

import java.util.Scanner;

public class breakingrecord {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int marks[]=new int[n];
          for(int i=0;i<n;i++) {
        	  marks[i]=sc.nextInt();
          }
          int max=0;
          int min=0;
          int countl=0;
          int counth=0;
          max=marks[0];
          min=marks[0];
        		  
          for(int i=1;i<n;i++) {
        	  if(marks[i]>max) {
        		  counth=counth+1;
        		  max=marks[i];
        	  }
        	  else if(marks[i]<min) {
        		  countl=countl+1;
        		  min=marks[i];
        	  }
          }
          System.out.println(+counth+" "+countl);
	}

}
