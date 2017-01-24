package xtras;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ReadWriteCopyOnWriterArrayList {
	CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<>();
	
	public ReadWriteCopyOnWriterArrayList(){
		threadSafeList.add("java");
		threadSafeList.add("unix");
		threadSafeList.add("linux");
	}
	
	public void readyArrayList(){
		
		try {
			Thread.sleep(3000);
			Iterator<String> failSafeIterator = threadSafeList.iterator();
			while (failSafeIterator.hasNext()) {
				System.out.println(Thread.currentThread().getName()+"--"+failSafeIterator.next());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void writeArrayList(){
		
		try {
			Thread.sleep(1000);

			for(int i=0;i<2;i++){
				threadSafeList.add(Thread.currentThread().getName() + "j2ee-"+i);
			}
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
}

public class CopyOnWriteArrayListApp {
	
	public static void main(String args[]){

		/*CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<>();
		threadSafeList.add("java");
		threadSafeList.add("unix");
		threadSafeList.add("linux");
		
		Iterator<String> failSafeIterator = threadSafeList.iterator();
		while (failSafeIterator.hasNext()) {
			System.out.println(failSafeIterator.next());
			//failSafeIterator.remove();
			
		}*/
		
		final ReadWriteCopyOnWriterArrayList rw = new ReadWriteCopyOnWriterArrayList();
		
		ExecutorService readExe = Executors.newFixedThreadPool(1);
		
		for(int i=0;i<5;i++){
			readExe.submit(new Runnable() {
				@Override
				public void run() {
					rw.readyArrayList();
				}
			},"Reader Thread-"+i);
		}
		
		ExecutorService writeExe = Executors.newFixedThreadPool(1);
		for(int i=0;i<5;i++){
			writeExe.submit(new Runnable() {
				@Override
				public void run() {
					rw.writeArrayList();
				}
			},"Writer Thread-"+i);
		}
		
		readExe.shutdown();
		writeExe.shutdown();
		
		try {
			readExe.awaitTermination(1, TimeUnit.HOURS);
			writeExe.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		rw.readyArrayList();

			
	}

}
