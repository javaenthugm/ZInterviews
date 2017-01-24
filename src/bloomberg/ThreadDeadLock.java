package bloomberg;

/*
 * Deadlock describes a situation where two or more threads are blocked forever, 
 * waiting for each other. Deadlocks can occur in Java 
 * when the synchronized keyword causes the executing 
 * thread to block while waiting to get the lock, 
 * associated with the specified object. 
 * Since the thread might already hold locks associated with other objects, 
 * two threads could each be waiting for the other to release a lock. 
 * In such case, they will end up waiting forever. - 
 * http://www.java2novice.com/java-interview-programs/thread-deadlock/#sthash.7zQcpZsa.dpuf
 * */
public class ThreadDeadLock {

	String str1 = "lock1";
	String str2 = "lock2";

	Thread thread1 = new Thread("Thread-1") {
		public void run() {

			try {

				while (true) {
					System.out.println(Thread.currentThread()
							+ " is entering Thread1's synchronized block");
					Thread.sleep(3000);
					synchronized (str1) {
						System.out
								.println(Thread.currentThread()
										+ " got lock: "
										+ str1
										+ " and entered Thread1's  synchronized block and needs lock:"
										+ str2 + " so waiting for lock:" + str2);
						Thread.sleep(3000);
						synchronized (str2) {
							System.out.println(Thread.currentThread()
									+ " holds lock:" + Thread.holdsLock(str2));
							Thread.sleep(3000);
						}
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	};

	Thread thread2 = new Thread("Thread-2") {
		public void run() {
			try {
				

				while (true) {
					
					System.out.println(Thread.currentThread()
							+ " is entering Thread2's synchronized block");
					Thread.sleep(2000);
					synchronized (str2) {
						System.out
								.println(Thread.currentThread()
										+ " got lock: "
										+ str2
										+ " and entered Thread1's  synchronized block and needs lock:"
										+ str1 + " so waiting for lock:" + str1);
						Thread.sleep(2000);
						synchronized (str1) {
							System.out.println(Thread.currentThread()
									+ " holds lock:" + Thread.holdsLock(str1));
							Thread.sleep(2000);
						}
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	};

	public static void main(String args[]) {
		ThreadDeadLock tLock = new ThreadDeadLock();
		tLock.thread1.start();

		tLock.thread2.start();
		
		try {
			tLock.thread1.join();
			tLock.thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
