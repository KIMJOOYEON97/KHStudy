package p7.account;

public class Account {

	private String account;
	private int balance;
	private double interestRate;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}
	

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance*(interestRate/100);

	}
	
	public void deposit(int money) {
		setBalance(balance += money); 
	}
	
	public void withdraw(int money) {
		if(money <= balance)
			setBalance(balance -= money);
	}
	
	public void accountInfo() {
		System.out.print("계좌번호 : "+this.getAccount()+" 잔액 : "+this.getBalance()+"원 "+" 이자율 : "+this.getInterestRate()+"% ");
	}
	
	
}
