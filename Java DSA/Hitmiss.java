package queue;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Hitmiss {
		static int miss=0;
	 static int hit=0;
	 static int front =-1;
	 static int rear=-1;
	 static PriorityQueue<Integer> myq=new PriorityQueue<Integer>();
	static void counter(int tofind)
	{
	if(rear<2) {
		myq.add(tofind);
		rear=rear+1;
		front=0;
	return;
	}
	else {
	if(myq.contains(tofind)) {
		hit=hit+1;
		return;
	}
	else {
		miss=miss+1;
		myq.remove();
		front=front+1;
		myq.add(tofind);
		rear=rear+1;
		return;
			}	
		}
	 }
	public static void main(String[] args) {	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of pages:");
		int n=sc.nextInt();
		
		System.out.println("Enter the pages");

		for(int i=0;i<n;i++) {
			int tofind=sc.nextInt();
			counter(tofind);
		}		
			System.out.println("The no. of page miss are: "+ miss+"\nThe no. of page hits are : "+hit);
	}
}
