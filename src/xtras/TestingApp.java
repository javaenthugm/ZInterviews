package xtras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class ObjectOne implements Comparable<ObjectOne>{
	int x;
	int y;
	public ObjectOne(){
		this.x=5;
		this.y=5;
	}
	public ObjectOne(int x,int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(ObjectOne o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class TestingApp {
	
	public static void main(String args[]){
		List<ObjectOne> list = new ArrayList<>();
		list.add(new ObjectOne());
		list.add(new ObjectOne());
		list.add(new ObjectOne());
		
		Collections.sort(list);
		
		CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<>();
		threadSafeList.add("java");
		threadSafeList.add("unix");
		threadSafeList.add("linux");
		
		Iterator<String> failSafeIterator = threadSafeList.iterator();
		while (failSafeIterator.hasNext()) {
			System.out.println(failSafeIterator.next());
			failSafeIterator.remove();
			
		}
		

			
	}

}
