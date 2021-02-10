package finddigit;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//public class divisorpairs {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int t=sc.nextInt();
//		for(int i=0;i<t;i++) {
//			int num=sc.nextInt();
//			int k=num;
//			int count=0;
//		while(num!=0) {
//			int x=num%10;
//			num=num/10;
//			if(x!=0)
//				if(k%x==0) {
//					count++;
//			}
//		}
//		System.out.println(count);
//	  }
//	}
//}
import java.util.Scanner;
public class divisorpairs {
        public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int p=0;
           int z=0;
           int neg=0;
           float pp,negneg,zz;
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                      }

           for(int i=0;i<n;i++){
               if(arr[i]<0){
                   neg++;
               }
               else if(arr[i]==0){
                   z++;
               }
               else{
                   p++;
               }
           }
           pp=p/n;
           zz=z/n;
           negneg=neg/n;
           System.out.println(pp);
           System.out.println(zz);

           System.out.println(negneg);

            
        }
}

