package functionalInterface;

public interface Functional_interface {
	
	public abstract void  sayHello();
	default void evensum() {
		System.out.println("i am using Default method");
	}
	static void  sum () {
		System.out.println("i am using static method");
	}
	default void even() {
		System.out.println("i am using Default method");
	}

}
