package homeWork.Bank;

public class DepositAccount extends Account {
	

	public DepositAccount(Customer owner, double balance, double monthlyInterestRate) {
		super(owner, balance, monthlyInterestRate);
		
	}

	public void withDraw(double withDrawAmount) {//taking  money to the account
		if (this.getBalance()<0) {
			return;
		}
		this.setBalance(this.getBalance() - withDrawAmount);
	}

	

	@Override
	public double calcInterest(int month,Customer owner) {//calculating the increasing interest per month. 
		double increase;
		if (super.getOwner().equals(owner)) {
		 increase=this.getBalance()*month*this.getMonthlyInterestRate();
			return increase;
		}
		return -1;
	}

	
	
	
}
