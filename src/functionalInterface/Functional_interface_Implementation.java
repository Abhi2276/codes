package functionalInterface;
import java.util.*;

public class Functional_interface_Implementation {

	public static void main(String[] args) {
		Functional_interface f1=()-> {
			System.out.println("i am using lambda");
		};
		Functional_interface.sum();
		f1.evensum();
		f1.sayHello();
		
		//f1.sum();compile time error

	}

}
