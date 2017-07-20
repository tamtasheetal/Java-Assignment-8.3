package MultiThreading; 
//This java file is inside package named MultiThreading inside src folder.
	
	public class SynchronizationSkills
	{
		public static void main(String[] args)    
		//Declaration of main function.
		{
			AccountDetails CommonObject = new AccountDetails(5000);   
			//Creating Account object which have 5000 Rs. balance initially.
			

			CustomerInfo FirstCustomer = new CustomerInfo(CommonObject , "Abhishek");
			CustomerInfo SecondCustomer = new CustomerInfo(CommonObject , "Puja");
			
			
			Thread firstThread = new Thread(FirstCustomer);
			Thread secondThread = new Thread(SecondCustomer);
			//Then we need to create two thread objects to pass the two objects of Customer.
			
			firstThread.start();  
			secondThread.start();  
		}   
		
	}   
