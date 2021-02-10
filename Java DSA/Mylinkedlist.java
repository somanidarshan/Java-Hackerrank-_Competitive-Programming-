package LinkedList;

import java.util.Scanner;

public class Mylinkedlist {
	
	Node head;
	void add(int data) {
		Node toadd=new Node(data);
		if(head==null) {
			head=toadd;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;//this loop will check whether it is last element or not
			//as last element is having null in its next
		}
		temp.next=toadd;
	}
	void print() {
		 Node temp=head;
		 while(temp !=null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
	}
	boolean isEmpty() {
		return head==null;
	}
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	

	public static void main(String[] args) {
		
		Mylinkedlist myll=new Mylinkedlist();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int s=sc.nextInt();
			myll.add(s);
		}
//		for(int i=0;i<10;i++) {
//			myll.add(i);
//		}
		myll.print();
		
		
		
	}

}
