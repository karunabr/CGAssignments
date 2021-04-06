package lab4;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	
	Account(){}
	
	Account(long accNo, double balance, Person accHolder){
		this.accNum=accNo;
		this.balance=balance;
		this.accHolder=accHolder;

	}
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	 void deposit(double amount)
	{
			balance+=amount;
	}
	
	 void withdraw(double amount)
	{
			balance-=amount;
	}
	
}
