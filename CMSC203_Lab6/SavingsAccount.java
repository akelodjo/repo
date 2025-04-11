
public class SavingsAccount extends BankAccount{
	private double rate = 2.5/100;
	private int savingsNumber;
	private String accountNumber;
	public SavingsAccount(String name,double amount) {
		// TODO Auto-generated constructor stub
		super(name,amount);
		this.savingsNumber=0;
		this.accountNumber = super.getAccountNumber()+"-"+ savingsNumber;
	}
	public SavingsAccount(SavingsAccount Savings,double balance) {
		super(Savings,balance);
		this.savingsNumber= Savings.getsavingsNumber()+1;
		this.accountNumber = super.getAccountNumber()+"-"+ this.savingsNumber;
		
		
	}
	public int getsavingsNumber() {
		return this.savingsNumber;
		
	}
	public void postInterest() {
		super.deposit(getBalance()*(rate/12));
	}
	@Override
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
}
