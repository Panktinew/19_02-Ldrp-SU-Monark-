package functionalInterface;


/*  An Interface that contains exactly one abstract method is known as functional interface.
 *  It can have any number of default, static methods but can contain only one abstract method. 
 *  It can also declare methods of object class. 
 *  Functional Interface is also known as Single Abstract Method Interfaces 
 *  or SAM Interfaces.
 */


@FunctionalInterface


public interface greetInterface {
	public String greet();
	
	
}
