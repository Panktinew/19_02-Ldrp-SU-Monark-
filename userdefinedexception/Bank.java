package userdefinedexception;

public class Bank {
	
	private String name;
	private int balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
	
		try {
			
			BalanceValidator.ValidateBalance(balance);
			this.balance = balance;
		}
		catch(InvalidBalanceException iv)
		{
			System.out.println(iv.getMessage());
		}
		
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", balance=" + balance + "]";
	}
	
	
	

}
