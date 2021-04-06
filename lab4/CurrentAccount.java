package lab4;

public class CurrentAccount extends Account {
	
	double maxWithdraw=5000;

	Account a1=new Account();
	void withdraw(double amount)
	{
		if(maxWithdraw<5000)
		{
			a1.withdraw(amount);
		}
	}

}
