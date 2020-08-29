
public class Driver {

	// Declare an initializes an int array variable
	static int[] newArray = { 1, 7, 3, 4, 9, 2 };

	public static void main(String[] args) {
		// Instantiate objects
		ArrayQ array = new ArrayQ();
		LinkedQueue queue = new LinkedQueue();

		// Loop through and add values into the array list.
		for (int index = 0; index < newArray.length; index++) {
			array.enqueue(newArray[index]);
		}

		// Loop through and remove values from the array list and print each value
		while (!(array.isEmpty())) {
			System.out.println(array.dequeue());
		}

		// Loop through and add values into the linked list.
		for (int index = 0; index < newArray.length; index++) {
			queue.enqueue(newArray[index]);
		}

		
		// Loop through and remove values from the array list and print each value
		for (int index = newArray.length - 1; index >= 0; index--) {
			System.out.println(queue.dequeue());
		}
	
		
		/*Used to Exercise 2 to call the removeMiddle method
		// Method to remove the middle value of the queue
				queue.removeMiddle(queue);
		*/

	}

}
