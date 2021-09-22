package raul.com;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplExample {

	Queue<String> wash = new PriorityQueue<>();

	public void carwash() throws InterruptedException {

		// adding cars to queue
		wash.offer("1-Mustang");
		wash.offer("2-Mercedes-Benz");
		wash.offer("3-Renault");
		wash.offer("4-Lexus");
		wash.offer("5-Renault");
		wash.offer("6-Ford");
		wash.offer("7-Ford");

		System.out.println("\n --This is a PriorityQueue: \n");

		Iterator it = wash.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		wash.remove("7-Ford");

		System.out.println("\n -- 7-Ford has been removed from PriorityQueue: \n");

		for (String e : wash) {
			System.out.println(e);
		}

		// Printing each element from queue
		while (!wash.isEmpty()) {

			System.out.println("Washing car: " + wash.peek());
			Thread.sleep(1000);
			System.out.println("Car " + wash.poll() + " has been washed");
			Thread.sleep(2000);
			System.out.println("Next car to be washed: " + wash.peek() + "\n");
			Thread.sleep(3000);
		}

		System.out.println("PriorityQueue is now empty: " + wash);
	}

}
