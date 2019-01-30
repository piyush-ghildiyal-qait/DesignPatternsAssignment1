package designpatterns;

public class Main {

	
	public static void main(String[] args) {
	
		EagerInitialization obj1=EagerInitialization.instance1;
		obj1.checkInstance();
		
		LazyInitialization obj2=LazyInitialization.getInstance();
		obj2.checkInstance();
		
		ThreadSafeVersion obj3=ThreadSafeVersion.getInstance();
		obj3.checkInstance();
	}
	
}
