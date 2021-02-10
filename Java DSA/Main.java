package matchesfound;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        String[] a=new String[n];
        for(int i=0;i<n;i++) {
            a[i]=ip.next();
        }
        int m=ip.nextInt();
        String[] q=new String[m];


        for(int i=0;i<m;i++) {
            q[i]=ip.next();
        }
        int[] arr =new int[m];
        for(int i=0;i<m;i++) {
            String test=q[i];
            int count=0;
            for(int j=0;j<n;j++) {
                if(a[j].equals(test)) {
                    count++;
                }
            }
            arr[i]=count;

        }
        for(int i=0;i<m;i++) {
            System.out.println(arr[i]);
        }


    }

}