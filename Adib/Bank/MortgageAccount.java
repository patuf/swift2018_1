package homeWork.Bank;

public class MortgageAccount extends Account{
	





	public MortgageAccount(Customer owner, double balance, double monthlyInterestRate) {
		super(owner, balance, monthlyInterestRate);
		
	}




	private IndividualCustomer individual;
	private CompanyCustomer company;




	@Override
	public double calcInterest(int month,Customer owner) {

		if (individual.equals(owner)) {
			return getBalance()*getMonthlyInterestRate() * (month-6);

			
		}
		if (company.equals(owner)) {
			if(month <= 12){ 
                return month * getBalance() * getMonthlyInterestRate() * 0.5; 
            } else{ 
                return  getBalance() * getMonthlyInterestRate()*(month - 6); 
            } 
        } 
		return -1;

	}

	
	
	
	
	

	

}
