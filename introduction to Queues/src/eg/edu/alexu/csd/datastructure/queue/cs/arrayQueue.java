package eg.edu.alexu.csd.datastructure.queue.cs;

public class arrayQueue implements IQueue,IArrayBased {
	
	static private int front =-1,rear=-1;
	private int capacity ;
	Object[] arr;
	public arrayQueue(int N){ // constructor for array size
		capacity =N;
		arr = new Object[N];
	}
	@Override
	public void enqueue(Object item) {
		// TODO Auto-generated method stub
		if((rear+1)%capacity == front) {
			throw new java.util.NoSuchElementException();
		}else if(isEmpty()) {
			front =rear=0;
		}else {
			rear = (rear+1) % capacity; 
		}
		arr[rear] = item;
	}

	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new java.util.NoSuchElementException();
		}else if(rear == front){
			Object temp = arr[front];
			front = rear = -1;
			return temp;
		}else {
			Object temp = arr[front];
			front = (front+1) % capacity;
			return temp;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(front == -1 && rear == -1) return true;
		else return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		if(isEmpty()) return 0;
		else return (rear - front) + 1;
	}

}
