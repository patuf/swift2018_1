package homeWork.Bank;

public class LoanAccount extends Account {

	public LoanAccount(Customer owner, double balance, double monthlyInterestRate) {
		super(owner, balance, monthlyInterestRate);
		
	}




	IndividualCustomer individual;
	CompanyCustomer company;

	


	@Override
	public double calcInterest(int month,Customer owner) {

		if (individual.equals(owner)) {
			
			return  this.getBalance()*this.getMonthlyInterestRate()*(month-3);

			
		}
		if (company.equals(owner)) {
			return this.getBalance()*this.getMonthlyInterestRate()*(month-2);

			

		}
		return -1;

	}

}
