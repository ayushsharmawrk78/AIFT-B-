package Lec35;

public class LinkedList {

	
	
	class Node{
		int val;
		Node next;
	}
	
	private Node head;
	
	private Node tail;
	int size;
	
	public LinkedList() {
		Node nn = new Node();
		this.head=nn;
		this.tail=nn;
		size=0;
	}
	
	public void addfirst(int item) {
		Node nn = new Node();
		
		nn.val=item;
		Node temp = head;
		head =nn;
		size++;
		head.next=temp;
	}
	public void addlast(int item) {
		Node nn = new Node();
		
		nn.val=item;

		tail.next=nn;
		tail=nn;
		size++;
	}
	
	public int removefirst() {
		int a = head.val;
		head=head.next;
		size--;
		return a;
		
	}
	
	
	public int removelast() {
		int a = tail.val;
Node temp = head;
while(temp.next!=tail) {
	temp = temp.next;
}
size--;

tail = temp;
tail.next=null;
return a;
		
	}
	public boolean isexist(int item) {
		Node temp = head;
		
		while(temp!=null) {
			if(temp.val==item) {
				return true;
			}
			temp = temp.next;
		}
		
		return false;
	}
	
	public int removeatindex(int k) throws Exception {
		
		
		if(k<0||k>size) {
			throw new Exception("invalid index");
		}
		if(k==size-1) {
			return removelast();
	
		}
		if(k==0) {
			return removefirst();
		}
		
		Node temp = head;
		int i =0;
		while(i<k) {
			temp = temp.next;
		}
		int a = temp.next.val;
		Node next = temp.next.next;
		temp.next = next;
		return a;
	}
public void addatindex(int item , int k) throws Exception {
		Node nn = new Node();
		nn.val=item;
		
		if(k<0||k>size) {
			throw new Exception("invalid index");
		}
		if(k==size) {
			addlast(item);
	
		}
		if(k==0) {
			
			 addfirst(item);
		}
		
		Node temp = head;
		int i =0;
		while(i<k) {
			temp = temp.next;
		}
		size++;
		Node next = temp.next;
	temp.next=nn;
	nn.next=next;
	}

public Node intersection(Node n1 , Node n2) {
	
	
	
	
	Node temp1 = n1;
	Node temp2 = n2;
	
	
	while(temp1!=temp2) {
		
		if(temp1==temp2) {
			return temp1;
		}
		
		else if (temp1==null) {
			temp2 = n1;
		}else if (temp2==null) {
			temp1 = n2;
		}
		temp1= temp1.next;
		temp2 = temp2.next;
	}
	
	return temp1;
}
	
	
}
