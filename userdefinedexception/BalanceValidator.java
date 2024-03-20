package userdefinedexception;

public class BalanceValidator {
	static void ValidateBalance(int bal) throws InvalidBalanceException,ArithmeticException   // this function may throw this exception
	{
		if(bal < 5000) {
			throw new InvalidBalanceException("Please enter balance greater than 5000 ");
		}
	}

}
