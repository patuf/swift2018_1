package Task2_Bank.Customers;

public class CompanyCustomer {
    private String clientName;

    public CompanyCustomer(String name) {
        this.clientName = name;
    }

    public String getCompName(){
        return clientName;
    }

    public void setCompName(String name){
        this.clientName = name;
    }
}
