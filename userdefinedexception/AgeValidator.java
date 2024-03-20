package userdefinedexception;

public class AgeValidator {
	static void validateAge(int age) throws InvalidAgeException ,NumberFormatException,ArrayIndexOutOfBoundsException{
	      if (age<18) {
	    	  throw new InvalidAgeException("Invalid age. You are not eligible to vote.");
	       }
	    } 

}
