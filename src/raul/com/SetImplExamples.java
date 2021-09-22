package raul.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplExamples {

	// HashSet implementation example
	Set<String> hashList = new HashSet<>();

	// LinkedHashSet implementation example
	Set<String> linkedHashList = new LinkedHashSet<>();

	// TreeSet implementation example
	Set<String> treeSetList = new TreeSet<>();

	public void listaHashSet() {
		// Filling out list
		hashList.add("Mustang");
		hashList.add("Mercedes-Benz");
		hashList.add("Renault");
		hashList.add("Lexus");
		hashList.add("Renault");
		hashList.add("Ford");
		hashList.add("Ford");

		System.out.println("\n --This is a hashSet list: \n");

		// Iterating each element from hashList
		Iterator it = hashList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Removing element from HashSet
		hashList.remove("Ford");

		System.out.println("\n --Ford has been removed from hashSet list: \n");

		// Printing each element from hashList using forEach
		for (String e : hashList) {
			System.out.println(e);
		}

	}

	public void listaLinkedHashSet() {
		// Filling out list
		linkedHashList.add("Mustang");
		linkedHashList.add("Mercedes-Benz");
		linkedHashList.add("Renault");
		linkedHashList.add("Lexus");
		linkedHashList.add("Renault");
		linkedHashList.add("Ford");
		linkedHashList.add("Ford");

		System.out.println("\n --This is a linkedHashSet list: \n");

		// Iterating each element from linkedHashList
		Iterator it = linkedHashList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Removing element from LinkedHashSet
		linkedHashList.remove("Renault");

		System.out.println("\n --Renault has been removed from linkedHashSet list: \n");

		// Printing each element from hashList using forEach
		for (String e : linkedHashList) {
			System.out.println(e);
		}
	}

	public void listaTreeSet() {
		// Filling out list
		treeSetList.add("Mustang");
		treeSetList.add("Mercedes-Benz");
		treeSetList.add("Renault");
		treeSetList.add("Lexus");
		treeSetList.add("Renault");
		treeSetList.add("Ford");
		treeSetList.add("Ford");

		System.out.println("\n --This is a treeSet list: \n");

		// Iterating each element from treeSetList
		Iterator it = treeSetList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Removing element from TreeSet
		treeSetList.remove("Lexus");

		System.out.println("\n --Lexus has been removed from treeSet list: \n");

		// Printing each element from hashList using forEach
		for (String e : treeSetList) {
			System.out.println(e);
		}

	}
}
