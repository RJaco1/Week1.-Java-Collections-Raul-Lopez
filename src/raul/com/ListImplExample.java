package raul.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListImplExample {

	// ArrayList implementation example
	List<String> listaArray = new ArrayList<>();

	// Vector implementation example
	List<String> vec = new Vector<>();

	// Vector implementation example
	List<String> linkedList = new LinkedList();

	public void listaArrayList() {
		// Filling out list
		listaArray.add("Mustang");
		listaArray.add("Mercedes-Benz");
		listaArray.add("Renault");
		listaArray.add("Lexus");
		listaArray.add("Renault");
		listaArray.add("Ford");
		listaArray.add("Ford");

		System.out.println("\n --This is an arrayList: \n");

		// Iterating each element from liastaArray
		Iterator it = listaArray.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Removing element from ArrayList
		listaArray.remove(4);

		System.out.println("\n ---Renault has been removed from ArrayList list at position 4: \n");

		// Printing each element from liastaArray using forEach
		for (String e : listaArray) {
			System.out.println(e);
		}

		// Removing element from ArrayList at position 5
		listaArray.set(5, "Renault");

		System.out.println("\n ---Renault has been updated at position 5 in ArrayList list: \n");

		// Printing each element from liastaArray using forEach
		for (String e : listaArray) {
			System.out.println(e);
		}

	}

	public void listaVector() {
		// Filling out list
		vec.add("Mustang");
		vec.add("Mercedes-Benz");
		vec.add("Renault");
		vec.add("Lexus");
		vec.add("Renault");
		vec.add("Ford");
		vec.add("Ford");

		System.out.println("\n --This is a Vector list: \n");

		// Iterating each element from liastaArra
		Iterator it = vec.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Removing element from ArrayList
		vec.remove(4);

		System.out.println("\n ---Renault has been removed from Vector list at position 4: \n");

		// Printing each element from liastaArray using forEach
		for (String e : vec) {
			System.out.println(e);
		}

		// Removing element from ArrayList at position 5
		vec.set(5, "Renault");

		System.out.println("\n ---Renault has been updated at position 5 in Vector list: \n");

		// Printing each element from liastaArray using forEach
		for (String e : vec) {
			System.out.println(e);
		}

	}

	public void listaLinkedList() {
		// Filling out list
		linkedList.add("Mustang");
		linkedList.add("Mercedes-Benz");
		linkedList.add("Renault");
		linkedList.add("Lexus");
		linkedList.add("Renault");
		linkedList.add("Ford");
		linkedList.add("Ford");

		System.out.println("\n --This is a LinkedList: \n");

		// Iterating each element from liastaArra
		Iterator it = linkedList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Removing element from LinkedList
		linkedList.remove(4);

		System.out.println("\n ---Renault has been removed from LinkedList list at position 4: \n");

		// Printing each element from liastaArray using forEach
		for (String e : linkedList) {
			System.out.println(e);
		}
		
		linkedList.remove("Mercedes-Benz");

		System.out.println("\n ---Mercedes-Benz has been removed from LinkedList list \n");

		// Printing each element from liastaArray using forEach
		for (String e : linkedList) {
			System.out.println(e);
		}

		// Removing element from ArrayList at position 5
		linkedList.set(4, "Renault");

		System.out.println("\n ---Renault has been updated at position 4 in LinkedList list: \n");

		// Printing each element from liastaArray using forEach
		for (String e : linkedList) {
			System.out.println(e);
		}

	}

}
