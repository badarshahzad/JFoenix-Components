package testing;

public class linkedlist {
	
	Node head;
	
	public void insert (int n){
		Node store = new Node (n);
		store.next = head;
		head = store;
	}
	public void display(){
		Node object = head;
		
		while(object!=null){
			object.display();
			object = object.next;
		}
	}
	
	public static void main(String args){
		linkedlist object = new linkedlist();
		object.insert(1);
		object.display();
	}

}

class Node{
	int data;
	Node next;

	public Node (int n){
		data = n;
		next = null;
	}
	
	public void display(){
		System.out.println("Value: "+data);
	}
}
