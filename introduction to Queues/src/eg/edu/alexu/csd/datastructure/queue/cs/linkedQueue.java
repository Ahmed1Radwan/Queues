package eg.edu.alexu.csd.datastructure.queue.cs;

public class linkedQueue implements IQueue,ILinkedBased {
	private LinkedList q = new LinkedList();
	@Override
	public void enqueue(Object item) {
		// TODO Auto-generated method stub
		q.add(item);
	}

	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new java.util.NoSuchElementException();
		}else {
			Object temp = q.get(0);
			q.remove(0);
			return temp;
		}
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(q.size()==0) 
			return true;
		else 
			return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return q.size();
	}

}
