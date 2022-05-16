package singleton;

public class Singleton {
	// private Singleton() {} 

/*	private Singleton() {}
	public static Singleton getInstance() {
		return new Singleton();		*/
	
	private static Singleton one;
	private Singleton() {}
	public static Singleton getInstance() {
		if(one == null) {
			one = new Singleton();
		}
		return one;
	}
}
