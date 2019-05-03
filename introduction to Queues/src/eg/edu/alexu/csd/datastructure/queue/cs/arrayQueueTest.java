package eg.edu.alexu.csd.datastructure.queue.cs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class arrayQueueTest {

	@Test
	void test() {
		IQueue q = new arrayQueue(5);
		
		assertEquals(true, q.isEmpty());
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		assertEquals(false, q.isEmpty());
		
		int expected = q.size();
		int actual = 5;
		assertEquals(expected, actual);
		
		expected = (int) q.dequeue();
		actual = 1;
		assertEquals(expected, actual);
		
		expected = (int) q.size();
		actual = 4;
		assertEquals(expected, actual);
		
		expected = (int) q.dequeue();
		actual = 2;
		assertEquals(expected, actual);
		
		expected = (int) q.size();
		actual = 3;
		assertEquals(expected, actual);
		
		expected = (int) q.dequeue();
		expected = (int) q.dequeue();
		expected = (int) q.dequeue();
		actual = 5;
		assertEquals(expected, actual);
		
		assertEquals(true, q.isEmpty());
		
	}

}
