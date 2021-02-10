package factorial;

import java.util.Scanner;

public class Factrial {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no. for the factorial");
        int num=sc.nextInt();
        if(num>=1) {
        	System.out.println("the factorial of the given no. is");
        	int fact=1;
        	for(int i=num;i>=1;i--) {
        		
        		fact=fact*i;
        	}
    		System.out.println(fact);
	
        }
        else
        	System.out.println("the no. is not defined");
	}

}
