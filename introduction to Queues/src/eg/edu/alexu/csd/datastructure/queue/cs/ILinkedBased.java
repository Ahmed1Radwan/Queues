package eg.edu.alexu.csd.datastructure.queue.cs;

public interface ILinkedBased {
	public int counter=0;
	public Node head = null;
	public void add(int index, Object element);
	public void add(Object element);
	public Object get(int index);
	public void set(int index, Object element);
	public void clear();
	public boolean isEmpty();
	public void remove(int index);
	public int size();
	public ILinkedBased sublist(int fromIndex, int toIndex);
	public boolean contains(Object o);
}
