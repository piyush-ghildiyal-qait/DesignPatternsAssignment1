package designpatterns;

public class ThreadSafeVersion {

	// private instance, so that it can be 
	  // accessed by only by getInstance() method 
	  private static ThreadSafeVersion instance; 
	  
	  private ThreadSafeVersion()  
	  { 
	    // private constructor 
	  } 
	  
	 //synchronized method to control simultaneous access 
	  synchronized public static ThreadSafeVersion getInstance()  
	  { 
	    if (instance == null)  
	    { 
	      // if instance is null, initialize 
	      instance = new ThreadSafeVersion(); 
	    } 
	    return instance; 
	  }
	  
	  public void checkInstance() {
		  System.out.println("instance is created by ThreadSafeVersion");
	  }
	
	
}
