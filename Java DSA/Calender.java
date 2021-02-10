package calender;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in DD/MM/YYYY Format");

		int date=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		String days[]={"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int monthcode[]= {0,0,3,3,6,1,4,6,2,5,0,3,5};
        int yearno=year%100;

        int lpyr=yearno/4;


        int century[]= {6,4,2,0};

        int i=year/100;

        int x=i%4;

        int code=century[x];

        int sum=date+monthcode[month]+lpyr+yearno+code;

        int remainder=sum%7;

        System.out.println("The day on "+date+"/"+month+"/"+year+" is "+days[remainder]);
        		
        
        
        
	}

}
