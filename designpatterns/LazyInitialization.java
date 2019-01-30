package designpatterns;

public class LazyInitialization {

	// private instance, so that it can be 
	  // accessed by only by getInstance() method 
	  private static LazyInitialization instance; 
	  
	  private LazyInitialization()  
	  { 
	    // private constructor 
	  } 
	  
	  //method to return instance of class 
	  public static LazyInitialization getInstance()  
	  { 
	    if (instance == null)  
	    { 
	      // if instance is null, initialize 
	      instance = new LazyInitialization(); 
	    } 
	    return instance; 
	  }
	  
	  public void checkInstance() {
		  System.out.println("instance is created by LazyInitialization");
	  }
	
	
}
