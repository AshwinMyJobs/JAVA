package javacodes.designpatterns.creational.singleton;

public class Singleton {

	private Singleton singleton;
	
	private Singleton() {}
	
	private Singleton getSingletonInstance() {
		if(singleton==null)
			return new Singleton();
		else
			return singleton;
	}
}
