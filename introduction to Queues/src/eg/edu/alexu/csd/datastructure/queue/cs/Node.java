package eg.edu.alexu.csd.datastructure.queue.cs;

public class Node {
	Object item;
	Node next;
	public Node(Object x) {
		item = x;
		next = null;
	}
	
	public Object getData() {
		return item;
	}
	public void setData(Object data) {
		item = data;
	}
	public void setNext(Node val) {
		next = val;
	}
	public Node getNext() {
		return next;
	}
}
