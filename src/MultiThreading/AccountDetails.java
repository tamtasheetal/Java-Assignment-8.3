package MultiThreading;
//This java file is inside package named MultiThreading inside src folder.


public class AccountDetails
{
	int balanceAmt;   
	//int variable to store the balance.
	
	public AccountDetails(int balanceAmt)
	{
		this.balanceAmt=balanceAmt;
	}

	public void depositMoney(int depositAmt)
	{
		balanceAmt = balanceAmt + depositAmt ;   
	//This will increase balanceAmt by adding depositAmt.
		
		System.out.println(depositAmt+" Your Amount has been successfully Depositted in Your Account.");   
		System.out.println("Your Account Balance is :- "+balanceAmt+"");    
	}
	
	public void withdrawMoney(int withdrawnAmt)
	//This is a method to withdraw money in the bank.
	{
		
		if(balanceAmt < withdrawnAmt)
	//To Check sufficient or insufficient Balance.
		{
			System.out.println("Insufficient Balance.");  
		}
		else
		{
			balanceAmt = balanceAmt - withdrawnAmt;   
			
			System.out.println("You have withdrawn Rs. :- "+withdrawnAmt);   
			System.out.println("Now, You have left Rs. :- "+balanceAmt+" in your account.");    
		}
	}
	
}   
