package DataStructureSlide;

public class LinkedList {
	private static Node front;
	private Node back;
	private Node current;
	private Node previous;
	

	public void enqueue(int key) {
		if(front == null) {
			front = new Node(key, null);
			current = front;
			previous = front;
			back = front;
		} else if (current == back) {
			back.next = new Node(key, null);
			previous = back;
			back = back.next;
			current = back;
		} else {
			previous.next = new Node(key, current);
			current = previous.next;
			
		}
	}
	
	public void remove(int key) {
		if(front.key == key) {
			front = front.next;
			return;
		}
		current = front.next;
		previous = front;
		
		while(true) {
			if(current.key == key) {
				previous.next = current.next;
				current = previous.next;
				return;
			}
			if(current == back && current.key == key) {
				back = previous;
				back.next = null;
				return;
			}
			previous = current;
			current = current.next;
		}
	}
	
	public void removeAtPosition(int position) {
		if(position == 1) {
			front = front.next;
		}
		current = front.next;
		previous = front;
		int count = 1;
		
		while(count < position - 1) {
			previous = current;
			current = current.next;
			count++;
		}
		previous.next = current.next;
		current = previous.next;
	}

	public boolean isEmpty() {
		return (front == null);
	}
	
	public boolean search(int x ) {
		return search(x, front);
	}
	
	public boolean search(int x, Node focusNode) {
		if(front == null) {
			return false;
		}
		if(focusNode == null) {
			return false;
		}
		if(focusNode.key == x) {
			return true;
		} else {
			return search(x, focusNode.next);
		}
	}
	
	public void inOrderTraverse(Node focusNode) {
		if(focusNode != null) {
			System.out.print(focusNode.key + ", ");
			inOrderTraverse(focusNode.next);
		}
		return;
	}

class Node {
	Node next;
	int key;
	
	public Node(int x, Node next) {
		this.key = x;
		this.next = next;
	}

	public String toString() {
		return "Node has " + key;
	}
}
}
