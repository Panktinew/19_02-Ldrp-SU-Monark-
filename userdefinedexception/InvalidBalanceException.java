package userdefinedexception;

public class InvalidBalanceException  extends Exception{

	InvalidBalanceException (){
		super("Invalid Balance");
	}
	InvalidBalanceException(String msg){
		super(msg);
	}
}
