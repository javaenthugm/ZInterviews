package bloomberg;

public class SingletonClassic {
	
	private static SingletonClassic singleton = null;
	
	private SingletonClassic(){
		
	}
	/*
	 * Classic Singleton 
	 * Lazy initialization - The intance will be created on 
	 * when the client invokes the getInstance() method.
	 * It is not thread safe.  
	 * Make it 'synchronized' to make it thread safe
	 * */
	public synchronized static SingletonClassic getInstance(){
		
		if(singleton ==null){
			singleton = new SingletonClassic();
		}
		
		return singleton;
	}
	
	public void testSingleton(String input){
		System.out.println(input);
	}

}
