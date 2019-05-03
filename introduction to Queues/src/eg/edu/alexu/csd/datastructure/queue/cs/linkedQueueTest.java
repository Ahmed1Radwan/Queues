package eg.edu.alexu.csd.datastructure.queue.cs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class linkedQueueTest {

	@Test
	void test() {
		IQueue q = new linkedQueue();
		assertEquals(true,q.isEmpty());
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		assertEquals(false,q.isEmpty());
		
		int expected = q.size();
		int actual = 3;
		assertEquals(expected,actual);
		
		expected = (int) q.dequeue();
		actual = 1;
		assertEquals(expected,actual);
		
		expected = (int) q.dequeue();
		actual = 2;
		assertEquals(expected,actual);
		
		expected = (int) q.dequeue();
		actual = 3;
		assertEquals(expected,actual);
		assertEquals(true,q.isEmpty());
		
		expected = q.size();
		actual = 0;
		assertEquals(expected,actual);
		
	
	}

}
