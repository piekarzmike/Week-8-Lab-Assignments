
// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;

	LinkedQueue() {
		front = rear = null;
		count = 0;
	}

	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear != null)
			rear.next = newNode;
		else
			front = newNode;
		rear = newNode;
		count++;
	}

	int dequeue() {
		if (front == null) {
			return -1;
		}

		if (front != rear) {
			int x = front.x;
			front = front.next;
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count--;
			return x;
		}
	}

	int first() {
		return front.x;
	}

	boolean isEmpty() {
		return count == 0;
	}

	int size() {
		return count;
	}

	// Removes the value that is in the middle
	public void removeMiddle(LinkedQueue modList) {

		// Declare an initializes variables
		int middle = (modList.size() / 2);

		// Instantiate an new queue used to store values removed
		LinkedQueue newQueue = new LinkedQueue();

		// Loop through and remove all value and place values into new queue besides the middle value
		while (modList.count > 0) {
			int item = modList.dequeue();
			if (modList.count == middle) {
				int remove = item;
			} else {
				newQueue.enqueue(item);
			}

		}
		;
	}

}
