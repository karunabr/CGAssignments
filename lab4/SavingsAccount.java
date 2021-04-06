package lab4;

public class SavingsAccount extends Account{
	
	double minBalance=500;

	Account a1=new Account();
	void withdraw(double amount)
	{
		if(minBalance>500)
		{
			a1.withdraw(amount);
		}
	}
	
}
