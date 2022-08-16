public class DebuggingExercise4
{
	public static void main(String[] args)
	{
		//creating an object 'a' that represents the Account class
		Account a = new Account("su");
		//call the deposit method to add funds to the account
		//100 is a valid integer that is passed as the value of the parameter
		a.deposit(100); 
		//call the getOwner and getBalance accessors from Account class
		//getOwner uses value assigned to class variable 'owner' through ctor
		//getBalance will grab the balance that is returned from the last method call
		System.out.println(a.getOwner() + " has $" + a.getBalance());
		//call the 'withdraw' method from Account class
		//error checking done in method in Account - checks for negative balance or 
		//if withdraw amount is more than what's available 
		a.withdraw(200);
		System.out.println("After trying to withdraw $200, " + a.getOwner() + " has $" + a.getBalance());
	}
}
