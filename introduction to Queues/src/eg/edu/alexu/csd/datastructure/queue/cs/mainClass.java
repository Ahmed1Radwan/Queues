package eg.edu.alexu.csd.datastructure.queue.cs;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			IQueue s = new linkedQueue();
			System.out.println(s.isEmpty());
			s.enqueue(1);
			s.enqueue(2);
			s.enqueue(3);
			System.out.println(s.dequeue());
			System.out.println(s.dequeue());
			System.out.println(s.dequeue());
			System.out.println(s.size());
			System.out.println(s.isEmpty());
			s.enqueue(5);
			s.enqueue(6);
			s.enqueue(7);
			s.enqueue(8);
			System.out.println(s.isEmpty());
			System.out.println(s.size());
			System.out.println(s.dequeue());
			System.out.println(s.dequeue());
		*/
		IQueue s = new arrayQueue(5);
		System.out.println(s.isEmpty());
		s.enqueue(1);
		s.enqueue(2);
		
		System.out.println(s.dequeue());
		System.out.println(s.dequeue());
		System.out.println(s.size());
		
	}

}
