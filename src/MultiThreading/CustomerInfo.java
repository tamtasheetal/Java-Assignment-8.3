package MultiThreading;     
//This java file is inside package named MultiThreading inside src folder.
	import java.util.*;       
	//This will import all classes from java's util library.
	
	public class CustomerInfo implements Runnable 
	{
		AccountDetails accountObj ;    
		//Account object will store the information.
		
		String customerName;    
		//To store the name of the Customer.
		
		public CustomerInfo(AccountDetails accountObj, String customerName) 
		{
			
			this.accountObj = accountObj;
			this.customerName = customerName;
			//It will Initializ the instance variable of class.
		}
		
		public void run() 
		{
			
			synchronized(accountObj)
			//This will Create Synchronized Block to avoid usage of inner code simultaneously by two threads.
			{
				System.out.println("Account Transaction is for :-"+customerName);     
				
				Scanner sc = new Scanner(System.in);     
				//Creating Scanner class object for User Inputs.
				
				try
				{
				System.out.print("Please Enter Amount you want to Deposit :-");    
				accountObj.depositMoney(sc.nextInt());         
				
				System.out.print("Please Enter Amount you want to Withdraw :-");    
				accountObj.withdrawMoney(sc.nextInt());         
				
				System.out.print("\n");  
				}
				catch(Exception e)
				{
					System.out.println(" Exception Occured.");
				}
			}	
		}   
	}   
	

