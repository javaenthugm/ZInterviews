package bloomberg;

public class SingletonSimple {
	
	private static final SingletonSimple singleton = new SingletonSimple();
	private SingletonSimple(){
		
	}
	/*
	 * Simple Singleton Implementation
	 * Thread safe
	 * */
	public static SingletonSimple getInstance(){
		return singleton;
	}

}
