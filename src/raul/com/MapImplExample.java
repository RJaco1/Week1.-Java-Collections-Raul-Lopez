package raul.com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImplExample {

	// Hashtable implementation example
	Map<Integer, String> ht = new Hashtable<>();

	// Hashtable implementation example
	Map<String, String> hm = new HashMap<>();

	// Hashtable implementation example
	Map<String, String> lhm = new LinkedHashMap<>();

	// TreeMap implementation example
	Map<String, String> tm = new TreeMap<>();

	public void hashTableList() {

		// Filling out list
		ht.put(1, "Mustang");
		ht.put(2, "Mercedes-Benz");
		ht.put(3, "Renault");
		ht.put(4, "Lexus");
		ht.put(5, "Renault");
		ht.put(5, "Renault");
		ht.put(6, "Ford");
		ht.put(7, "Ford");

		System.out.println("\n --This is a Hashtable: \n");

		Iterator it = ht.keySet().iterator();

		// Printing each element from Hashtable
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Key: " + key + " -> Value: " + ht.get(key));
		}

		ht.put(7, "Ford2");

		System.out.println("\n --Ford has been updated to Ford2 in Hashtable: \n");

		for (Map.Entry<Integer, String> e : ht.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}

		ht.remove(7);

		System.out.println("\n --Ford2 in Hashtable has been removed: \n");

		for (Map.Entry<Integer, String> e : ht.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}

	}

	public void hashMapList() {

		// Filling out list
		hm.put("5", "Renault");
		hm.put("6", "Ford");
		hm.put("7", null);
		hm.put(null, "Nissan");
		hm.put("1", "Mustang");
		hm.put("1", "Mustang");
		hm.put("2", "Mercedes-Benz");
		hm.put("3", "Renault");
		hm.put("4", "Lexus");

		System.out.println("\n --This is a HashMap: \n");

		Iterator it = hm.keySet().iterator();

		// Printing each element from HashMap
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println("Key: " + key + " -> Value: " + hm.get(key));
		}
		
		hm.put("7", "Ford2");

		System.out.println("\n --key 7 has been updated to Ford2 in HashMap: \n");

		for (Map.Entry<String, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}

		hm.remove("7");

		System.out.println("\n --Ford2 in HashMap has been removed: \n");

		for (Map.Entry<String, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}
	}

	public void linkedHashMapList() {

		// Filling out list
		lhm.put("5", "Renault");
		lhm.put("6", "Ford");
		lhm.put("7", null);
		lhm.put(null, "Nissan");
		lhm.put("1", "Mustang");
		lhm.put("1", "Mustang");
		lhm.put("2", "Mercedes-Benz");
		lhm.put("3", "Renault");
		lhm.put("4", "Lexus");

		System.out.println("\n --This is a LinkedHashMap: \n");

		Iterator it = lhm.keySet().iterator();

		// Printing each element from LinkedHashMap
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println("Key: " + key + " -> Value: " + lhm.get(key));
		}
		
		lhm.put("7", "Ford2");

		System.out.println("\n --key 7 has been updated to Ford2 in LinkedHashMap: \n");

		for (Map.Entry<String, String> e : lhm.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}

		lhm.remove("7");

		System.out.println("\n --Ford2 in LinkedHashMap has been removed: \n");

		for (Map.Entry<String, String> e : lhm.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}
	}

	public void treeMapList() {

		// Filling out list
		tm.put("5", "Renault");
		tm.put("6", "Ford");
		tm.put("7", null);
		tm.put("1", "Mustang");
		tm.put("1", "Mustang");
		tm.put("2", "Mercedes-Benz");
		tm.put("3", "Renault");
		tm.put("4", "Lexus");

		System.out.println("\n --This is a TreeMap: \n");

		Iterator it = tm.keySet().iterator();

		// Printing each element from LinkedHashMap
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println("Key: " + key + " -> Value: " + tm.get(key));
		}
		
		tm.put("7", "Ford2");

		System.out.println("\n --key 7 has been updated to Ford2 in TreeMap: \n");

		for (Map.Entry<String, String> e : tm.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}

		tm.remove("7");

		System.out.println("\n --Ford2 in TreeMap has been removed: \n");

		for (Map.Entry<String, String> e : tm.entrySet()) {
			System.out.println(e.getKey() + " -> " + e.getValue());
		}
	}

}
