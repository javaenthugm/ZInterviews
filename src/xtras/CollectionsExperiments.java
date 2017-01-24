package xtras;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsExperiments {
	
	public static void main(String args[]){
		
		/*Collection<String> coll; 
		
		coll = new ArrayList<String>();
		System.out.println(coll.add("new"));
		System.out.println(coll.remove("ndew"));
		
		for(String s: coll){
			System.out.println(s);
		}
		System.out.println();
		
		coll = new HashSet<String>();
		System.out.println(coll.add("new"));
		System.out.println(coll.add("new"));
		
		for(String s: coll){
			System.out.println(s);
		}*/
		
		/*Set<String> set = new HashSet<String>();
		set.add("Paru");
		set.add("Paru");
		set.add("Parvathy");
		
		set.add("element 1");
		set.add("element 2");
		set.add("element 3");
		System.out.println(set.contains("Paru"));
		*/
		/*for(String s:set){
			System.out.println(s);
		}*/
		
		/*Set setA = new HashSet();

		setA.add("element 0");
		setA.add("element 1");
		setA.add("element 2");

		//access via Iterator
		Iterator iterator = setA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println(element);
		}

		System.out.println();
		//access via new for-loop
		for(Object object : setA) {
		    String element = (String) object;
		    System.out.println(element);
		}
		 */		
		
		/*SortedSet<String> set = new TreeSet<String>();
		set.add("4");
		set.add("element 1");
		set.add("belement 2");
		set.add("alement 3");
		
		for(String s:set){
			System.out.println(s);
		}
		
		
		String one = "onetrere";
		String two = "one";
		System.out.println(one.compareTo(two));*/
		
		//Map<Integer, String> map = new TreeMap<Integer, String>();
		/*Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "A");
		map.put(2, "b");
		map.put(4, "d");
		map.put(15, "c");
		map.put(4, "z");
		
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()){
			System.out.println(map.get(keys.next()));
		}
		
		for (Integer key : map.keySet()){
			String value = map.get(key);
			System.out.println(key+":"+value);
		}*/
		
		//Queue<String> q = new LinkedList<String>();
		Deque<String> q = new LinkedList<String>();
		q.add("a");
		q.add("k");
		q.add("c");
		
		System.out.println(q.element());
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
		System.out.println();
		System.out.println(q.pollFirst());
		System.out.println(q.element());
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
		
		/*System.out.println();
		System.out.println(q.peek());
		System.out.println();
		System.out.println(q.poll());
		for(String s:q){
			System.out.println(s);
		}*/
		
	}

}
