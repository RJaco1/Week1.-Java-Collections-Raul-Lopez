package raul.com;

public class Collections {

	public static void main(String[] args) throws InterruptedException {

		SetImplExamples sets = new SetImplExamples();
		// HashSet implementation example
		sets.listaHashSet();
		// LinkedHashSet implementation example
		sets.listaLinkedHashSet();
		// LinkedHashSet implementation example
		sets.listaTreeSet();

		ListImplExample lists = new ListImplExample();
		// ArrayList implementation example
		lists.listaArrayList();
		// Vector implementation example
		lists.listaVector();
		// LinkedList implementation example
		lists.listaLinkedList();

		QueueImplExample queues = new QueueImplExample();
		// PriorityQueue implementation example
		queues.carwash();

		MapImplExample maps = new MapImplExample();
		// Hashtable implementation example
		maps.hashTableList();
		// HashMap implementation example
		maps.hashMapList();
		// LinkedHashMap implementation example
		maps.linkedHashMapList();
		// TreeMap implementation example
		maps.treeMapList();

	}

}
