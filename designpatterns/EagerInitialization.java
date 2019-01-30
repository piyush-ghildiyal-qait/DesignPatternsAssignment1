package designpatterns;

public class EagerInitialization {
	// public instance initialized when loading the class
	public static EagerInitialization instance1 = new EagerInitialization(); 
	  
	  private EagerInitialization() {
	 // private constructor
	}

	  public void checkInstance() {
		  System.out.println("instance is created by EagerInitialization");
	  }
	  
	  
}




