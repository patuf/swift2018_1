package Task2_Bank.Customers;

public class Clients {
    private int CompCustCounter = 0;
    private int IndCustCounter = 0;

    public boolean OpenClientType(String name, int customerType){
        if(customerType==1){
            IndividualCustomer indCust = new IndividualCustomer(name);
            ++IndCustCounter;
            return true;
        }
        if(customerType==2){
            CompanyCustomer comCust = new CompanyCustomer(name);
            ++CompCustCounter;
            return true;
        }
        return false;
    }
}