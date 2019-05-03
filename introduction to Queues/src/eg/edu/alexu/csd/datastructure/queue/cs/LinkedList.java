package eg.edu.alexu.csd.datastructure.queue.cs;


public class LinkedList implements ILinkedBased {
	public int counter=0;
	public Node head = null;
	public LinkedList() {
		
	}
	

	public void add(int index, Object data) {
		// TODO Auto-generated method stub
		Node temp = new Node(data);
		Node curr = head;
		if(curr != null) {
			for(int i=0;i<index && curr.getNext() != null;i++) {
				curr = curr.getNext();
			}
		}
		temp.setNext(curr.getNext());
		curr.setNext(temp);
		incrementCounter();
	}
	
	
	public void add(Object data) {
		// TODO Auto-generated method stub
		if(head == null) {
			head = new Node(data);
		}
		Node temp = new Node(data);
		Node curr = head;
		if(curr != null) {
			while(curr.getNext() != null) {
				curr = curr.getNext();
			}
			curr.setNext(temp);
		}
		incrementCounter();
	}
	
	private void incrementCounter() {
		counter++;
	}
	private int getCounter() {
		return counter;
	}
	private void decrementCounter() {
		counter--;
	}
	
	public Object get(int index) {
		// TODO Auto-generated method stub
		if(index < 0) return null;
		Node curr = null;
		if(head != null) {
			curr = head.getNext();
			for(int i=0;i<index;i++) {
				if(curr.getNext() == null) {
					return null;
				}
				curr = curr.getNext();
			}
			return curr.getData();
		}
		return curr;
	}

	
	public void set(int index, Object element) {
		// TODO Auto-generated method stub
		if(index < 0 || index > size()-1) return;
		Node curr = head.getNext();
		if(head != null) {
			for(int i=0;i<index;i++) {
				if(curr.getNext() == null) return;
				curr = curr.getNext();
			}
		}
		curr.setData(element);
		return;
	}

	
	public void clear() {
		// TODO Auto-generated method stub
		if(head == null) return;
		Node curr = head.getNext();
		while(curr!=null) {
			Node temp = curr.getNext();
			curr = null;
			curr = temp;
		}
		head = null;
		return;
	}

	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(getCounter() == 0) return true;
		else return false;
	}

	
	public void remove(int index) {
		// TODO Auto-generated method stub
		if(index < 0 || index > (size() - 1)) {
			return;
		}
		
		Node curr =head;
		if(index == 0) head = head.getNext();
		if(head != null) {
			for(int i=0;i<index;i++) {
				if(curr.getNext() == null) return;
				curr = curr.getNext();
			}
		}
		curr.setNext(curr.getNext().getNext());
		decrementCounter();
		return;
	}

	
	public int size() {
		// TODO Auto-generated method stub
		return getCounter();
	}


	public ILinkedBased sublist(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		if(head == null) return null;
		LinkedList L = new LinkedList();
		Node curr = head.getNext();
		for(int i=0;i<size()&&curr != null;i++) {
			if(i>=fromIndex && i<=toIndex) {
				L.add(curr.getData());
			}
			curr = curr.getNext();
		}
		return L;
	}


	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		if(head == null) return false;
		Node curr = head.getNext();
		if(head != null) {
			while(curr != null) {
				if(curr.getData() == o) {
					return true;
				}
				curr = curr.getNext();
			}
		}
		return false;
	}
}
