package lab4;

public class Bank {

public static void main(String[] args) {
		
		Person p1 = new Person("Smith", 29);
		Person p2 = new Person("Kathy", 35);
		
		Account a1=new Account(1101,2000,p1);
		Account a2=new Account(1342,3000,p2);
		
		Account a3=new SavingsAccount();
		Account a4=new CurrentAccount();
		
		a1.deposit(5000);
		System.out.println("Smith's Balance "+a1.getBalance());
		
		a2.withdraw(1000);
		System.out.println("Kathy's Balance "+a2.getBalance());
	}

}
